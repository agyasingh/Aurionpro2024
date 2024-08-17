package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductService extends AbstractService {

    private SupplierService supplierService;

    public ProductService(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    public void addProduct(int productId, String name, String description, int supplierId) throws SQLException {
        if (!supplierService.isParentRecordExists("suppliers", "supplier_id", supplierId)) {
            throw new SQLException("Supplier with ID " + supplierId + " does not exist. Add the supplier first.");
        }

        String query = "INSERT INTO products (product_id, name, description, supplier_id) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, productId);
            stmt.setString(2, name);
            stmt.setString(3, description);
            stmt.setInt(4, supplierId);
            stmt.executeUpdate();
        }
    }

    public void updateProduct(int productId, String newName, String newDescription, int newSupplierId) throws SQLException {
        if (!supplierService.isParentRecordExists("suppliers", "supplier_id", newSupplierId)) {
            throw new SQLException("Supplier with ID " + newSupplierId + " does not exist. Update the supplier first.");
        }

        String query = "UPDATE products SET name = ?, description = ?, supplier_id = ? WHERE product_id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, newName);
            stmt.setString(2, newDescription);
            stmt.setInt(3, newSupplierId);
            stmt.setInt(4, productId);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("Product with ID " + productId + " does not exist.");
            }
        }
    }

    public void deleteProduct(int productId) throws SQLException {
        if (hasChildRecords("order_details", "product_id", productId)) {
            throw new SQLException("Product with ID " + productId + " has associated order details. Delete associated order details first.");
        }
        if (hasChildRecords("inventory", "product_id", productId)) {
            throw new SQLException("Product with ID " + productId + " has associated inventory records. Delete associated inventory records first.");
        }

        String query = "DELETE FROM products WHERE product_id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, productId);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("Product with ID " + productId + " does not exist.");
            }
        }
    }
    public void displayAllProducts() throws SQLException {
        String query = "SELECT * FROM Product";
        
        try (Connection conn = DatabaseUtil.getConnection();
        		PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("Product ID: " + rs.getInt("product_id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Description: " + rs.getString("description"));
                System.out.println("Supplier ID: " + rs.getInt("supplier_id"));
                System.out.println("--------------------------");
            }
        }
    }
}
