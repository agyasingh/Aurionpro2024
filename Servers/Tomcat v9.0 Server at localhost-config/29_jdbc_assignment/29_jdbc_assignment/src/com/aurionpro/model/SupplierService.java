package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SupplierService extends AbstractService {

    public void addSupplier(int supplierId, String name, String contactInfo, String address) throws SQLException {
        String query = "INSERT INTO suppliers (supplier_id, name, contact_info, address) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, supplierId);
            stmt.setString(2, name);
            stmt.setString(3, contactInfo);
            stmt.setString(4, address);
            stmt.executeUpdate();
        }
    }

    public void updateSupplier(int supplierId, String newName, String newContactInfo, String newAddress) throws SQLException {
        String query = "UPDATE suppliers SET name = ?, contact_info = ?, address = ? WHERE supplier_id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, newName);
            stmt.setString(2, newContactInfo);
            stmt.setString(3, newAddress);
            stmt.setInt(4, supplierId);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("Supplier with ID " + supplierId + " does not exist.");
            }
        }
    }

    public void deleteSupplier(int supplierId) throws SQLException {
        if (hasChildRecords("products", "supplier_id", supplierId)) {
            throw new SQLException("Supplier with ID " + supplierId + " has associated products. Delete associated products first.");
        }

        String query = "DELETE FROM suppliers WHERE supplier_id = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, supplierId);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("Supplier with ID " + supplierId + " does not exist.");
            }
        }
    }
    public void displayAllSuppliers() throws SQLException {
        String query = "SELECT * FROM Supplier";
        try (	Connection conn = DatabaseUtil.getConnection();
        		PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("Supplier ID: " + rs.getInt("supplier_id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Contact Info: " + rs.getString("contact_info"));
                System.out.println("Address: " + rs.getString("address"));
                System.out.println("--------------------------");
            }
        }
    }
}
