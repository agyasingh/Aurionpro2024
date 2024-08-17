package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderService extends AbstractService {

    private SupplierService supplierService;

    public OrderService(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    public void addOrder(int orderId, String orderDate, int supplierId) throws SQLException {
        if (!supplierService.isParentRecordExists("suppliers", "supplier_id", supplierId)) {
            throw new SQLException("Supplier with ID " + supplierId + " does not exist. Add the supplier first.");
        }

        String query = "INSERT INTO orders (order_id, order_date, supplier_id) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, orderId);
            stmt.setString(2, orderDate);
            stmt.setInt(3, supplierId);
            stmt.executeUpdate();
        }
    }

    public void updateOrder(int orderId, String newOrderDate, int newSupplierId) throws SQLException {
        if (!supplierService.isParentRecordExists("suppliers", "supplier_id", newSupplierId)) {
            throw new SQLException("Supplier with ID " + newSupplierId + " does not exist. Update the supplier first.");
        }

        String query = "UPDATE orders SET order_date = ?, supplier_id = ? WHERE order_id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, newOrderDate);
            stmt.setInt(2, newSupplierId);
            stmt.setInt(3, orderId);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("Order with ID " + orderId + " does not exist.");
            }
        }
    }

    public void deleteOrder(int orderId) throws SQLException {
        if (hasChildRecords("order_details", "order_id", orderId)) {
            throw new SQLException("Order with ID " + orderId + " has associated order details. Delete associated order details first.");
        }

        String query = "DELETE FROM orders WHERE order_id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, orderId);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("Order with ID " + orderId + " does not exist.");
            }
        }
    }
    public void displayAllOrders() throws SQLException {
        String query = "SELECT * FROM `Order`";
        try (Connection conn = DatabaseUtil.getConnection();
        		PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("Order ID: " + rs.getInt("order_id"));
                System.out.println("Order Date: " + rs.getString("order_date"));
                System.out.println("Supplier ID: " + rs.getInt("supplier_id"));
                System.out.println("--------------------------");
            }
        }
    }
}
