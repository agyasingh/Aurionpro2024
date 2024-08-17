package com.aurionpro.test;

import java.sql.SQLException;

import com.aurionpro.model.Facade;
import com.aurionpro.model.InventoryService;
import com.aurionpro.model.OrderDetailService;
import com.aurionpro.model.OrderService;
import com.aurionpro.model.ProductService;
import com.aurionpro.model.SupplierService;

public class TestFacade {

    public static void main(String[] args) {
        try {
            SupplierService supplierService = new SupplierService();
            ProductService productService = new ProductService(supplierService);
            OrderService orderService = new OrderService(supplierService);
            OrderDetailService orderDetailService = new OrderDetailService(orderService, productService);
            InventoryService inventoryService = new InventoryService(productService);

            Facade facade = new Facade(supplierService, productService, orderService, orderDetailService, inventoryService);

            // Add a new suppliers
//            facade.addSupplier(16, "Acme Corp", "123-456-7890", "123 Elm St");
            facade.deleteSupplier(16);
            // Add a new product
//            facade.addProduct(121, "Widget", "A useful widget", 1);
//
//            // Add a new order
//            facade.addOrder(1111, "2024-08-08", 1);
//
//            // Add a new order detail
//            facade.addOrderDetail(2001, 1001, 101, 10, 19.99);
//
//            // Add inventory for the product
//            facade.addInventory(3001, 101, 50);
//
//            // Display confirmation message
//            System.out.println("Database operations completed successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
