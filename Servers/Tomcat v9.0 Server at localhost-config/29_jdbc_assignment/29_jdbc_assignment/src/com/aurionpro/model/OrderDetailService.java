package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDetailService extends AbstractService {

    private OrderService orderService;
    private ProductService productService;

    public OrderDetailService(OrderService orderService, ProductService productService) {
        this.orderService = orderService;
        this.productService = productService;
    }

    public void addOrderDetail(int orderDetailId, int orderId, int productId, int quantity, double price) throws SQLException {
        if (!orderService.isParentRecordExists("orders", "order_id", orderId)) {
            throw new SQLException("Order with ID " + orderId + " does not exist. Add the order first.");
        }
        if (!productService.isParentRecordExists("products", "product_id", productId)) {
            throw new SQLException("Product with ID " + productId + " does not exist. Add the product first.");
        }

        String query = "INSERT INTO order_details (order_detail_id, order_id, product_id, quantity, price) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, orderDetailId);
            stmt.setInt(2, orderId);
            stmt.setInt(3, productId);
            stmt.setInt(4, quantity);
            stmt.setDouble(5, price);
            stmt.executeUpdate();
        }
    }

    public void updateOrderDetail(int orderDetailId, int newOrderId, int newProductId, int newQuantity, double newPrice) throws SQLException {
        if (!orderService.isParentRecordExists("orders", "order_id", newOrderId)) {
            throw new SQLException("Order with ID " + newOrderId + " does not exist. Update the order first.");
        }
        if (!productService.isParentRecordExists("products", "product_id", newProductId)) {
            throw new SQLException("Product with ID " + newProductId + " does not exist. Update the product first.");
        }

        String query = "UPDATE order_details SET order_id = ?, product_id = ?, quantity = ?, price = ? WHERE order_detail_id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, newOrderId);
            stmt.setInt(2, newProductId);
            stmt.setInt(3, newQuantity);
            stmt.setDouble(4, newPrice);
            stmt.setInt(5, orderDetailId);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("Order detail with ID " + orderDetailId + " does not exist.");
            }
        }
    }

    public void deleteOrderDetail(int orderDetailId) throws SQLException {
        String query = "DELETE FROM order_details WHERE order_detail_id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, orderDetailId);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("Order detail with ID " + orderDetailId + " does not exist.");
            }
        }
    }
    public void displayAllOrderDetails() throws SQLException {
        String query = "SELECT * FROM OrderDetail";
        try (	Connection conn = DatabaseUtil.getConnection();
        		PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("Order Detail ID: " + rs.getInt("order_detail_id"));
                System.out.println("Order ID: " + rs.getInt("order_id"));
                System.out.println("Product ID: " + rs.getInt("product_id"));
                System.out.println("Quantity: " + rs.getInt("quantity"));
                System.out.println("Price: " + rs.getDouble("price"));
                System.out.println("--------------------------");
            }
        }
    }
}
