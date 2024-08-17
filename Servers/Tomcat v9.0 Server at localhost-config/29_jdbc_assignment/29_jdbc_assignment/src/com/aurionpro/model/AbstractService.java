package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbstractService {

	protected boolean isParentRecordExists(String tableName, String idColumnName, int idValue) throws SQLException {
		String query = "SELECT 1 FROM " + tableName + " WHERE " + idColumnName + " = ?";
		try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setInt(1, idValue);
			ResultSet rs = stmt.executeQuery();
			return rs.next(); // If there's a result, the record exists
		}
	}

	protected boolean hasChildRecords(String tableName, String foreignKeyColumn, int parentId) throws SQLException {
		String query = "SELECT 1 FROM " + tableName + " WHERE " + foreignKeyColumn + " = ?";
		try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setInt(1, parentId);
			ResultSet rs = stmt.executeQuery();
			return rs.next(); // If there's a result, there are child records
		}
	}
}
