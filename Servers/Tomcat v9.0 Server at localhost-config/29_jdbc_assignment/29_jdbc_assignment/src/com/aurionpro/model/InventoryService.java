package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InventoryService extends AbstractService {

    private ProductService productService;

    public InventoryService(ProductService productService) {
        this.productService = productService;
    }

    public void addInventory(int inventoryId, int productId, int quantityOnHand) throws SQLException {
        if (!productService.isParentRecordExists("products", "product_id", productId)) {
            throw new SQLException("Product with ID " + productId + " does not exist. Add the product first.");
        }

        String query = "INSERT INTO inventory (inventory_id, product_id, quantity_on_hand) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, inventoryId);
            stmt.setInt(2, productId);
            stmt.setInt(3, quantityOnHand);
            stmt.executeUpdate();
        }
    }

    public void updateInventory(int inventoryId, int newProductId, int newQuantityOnHand) throws SQLException {
        if (!productService.isParentRecordExists("products", "product_id", newProductId)) {
            throw new SQLException("Product with ID " + newProductId + " does not exist. Update the product first.");
        }

        String query = "UPDATE inventory SET product_id = ?, quantity_on_hand = ? WHERE inventory_id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, newProductId);
            stmt.setInt(2, newQuantityOnHand);
            stmt.setInt(3, inventoryId);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("Inventory record with ID " + inventoryId + " does not exist.");
            }
        }
    }

    public void deleteInventory(int inventoryId) throws SQLException {
        String query = "DELETE FROM inventory WHERE inventory_id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, inventoryId);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("Inventory record with ID " + inventoryId + " does not exist.");
            }
        }
    }
    public void displayAllInventories() throws SQLException {
        String query = "SELECT * FROM Inventory";
        try (	Connection conn = DatabaseUtil.getConnection();
        		PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("Inventory ID: " + rs.getInt("inventory_id"));
                System.out.println("Product ID: " + rs.getInt("product_id"));
                System.out.println("Quantity on Hand: " + rs.getInt("quantity_on_hand"));
                System.out.println("--------------------------");
            }
        }
    }
}


