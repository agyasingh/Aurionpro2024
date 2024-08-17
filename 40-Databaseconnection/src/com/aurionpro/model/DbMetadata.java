package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbMetadata {

    private Connection connection = null;
    private DatabaseMetaData databaseMetaData = null;

    public void connectToDb() {
        try {
            // Register driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/organization", "root", "root");

            // Get Database MetaData
            databaseMetaData = connection.getMetaData();

            System.out.println("Connection successful");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void getTableMetadata(String tableName) {
        try {
            // Check if the table exists
            try (ResultSet tables = databaseMetaData.getTables(null, null, tableName, new String[]{"TABLE"})) {
                if (tables.next()) {
                    System.out.println("Table: " + tableName + " exists.");
                    System.out.println("Fetching metadata...");

                    // Get columns metadata
                    try (ResultSet columns = databaseMetaData.getColumns(null, null, tableName, null)) {
                        while (columns.next()) {
                            String columnName = columns.getString("COLUMN_NAME");
                            String datatype = columns.getString("TYPE_NAME");
                            int columnSize = columns.getInt("COLUMN_SIZE");
                            String isNullable = columns.getString("IS_NULLABLE");
                            String isAutoIncrement = columns.getString("IS_AUTOINCREMENT");

                            System.out.println("Column Name: " + columnName);
                            System.out.println("Data Type: " + datatype);
                            System.out.println("Column Size: " + columnSize);
                            System.out.println("Is Nullable: " + isNullable);
                            System.out.println("Is Auto Increment: " + isAutoIncrement);
                            System.out.println();
                        }
                    }
                } else {
                    System.out.println("Table: " + tableName + " does not exist.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}
