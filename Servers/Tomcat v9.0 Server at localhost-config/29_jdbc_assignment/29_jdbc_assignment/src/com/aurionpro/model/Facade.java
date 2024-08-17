package com.aurionpro.model;

import java.sql.SQLException;

public class Facade {

    private SupplierService supplierService;
    private ProductService productService;
    private OrderService orderService;
    private OrderDetailService orderDetailService;
    private InventoryService inventoryService;

    public Facade(SupplierService supplierService, ProductService productService, OrderService orderService, OrderDetailService orderDetailService, InventoryService inventoryService) {
        this.supplierService = supplierService;
        this.productService = productService;
        this.orderService = orderService;
        this.orderDetailService = orderDetailService;
        this.inventoryService = inventoryService;
    }



    public void addSupplier(int supplierId, String name, String contactInfo, String address) throws SQLException {
        supplierService.addSupplier(supplierId, name, contactInfo, address);
    }

    public void updateSupplier(int supplierId, String newName, String newContactInfo, String newAddress) throws SQLException {
        supplierService.updateSupplier(supplierId, newName, newContactInfo, newAddress);
    }

    public void deleteSupplier(int supplierId) throws SQLException {
        supplierService.deleteSupplier(supplierId);
    }


    public void addProduct(int productId, String name, String description, int supplierId) throws SQLException {
        productService.addProduct(productId, name, description, supplierId);
    }

    public void updateProduct(int productId, String newName, String newDescription, int newSupplierId) throws SQLException {
        productService.updateProduct(productId, newName, newDescription, newSupplierId);
    }

    public void deleteProduct(int productId) throws SQLException {
        productService.deleteProduct(productId);
    }

 
    public void addOrder(int orderId, String orderDate, int supplierId) throws SQLException {
        orderService.addOrder(orderId, orderDate, supplierId);
    }

    public void updateOrder(int orderId, String newOrderDate, int newSupplierId) throws SQLException {
        orderService.updateOrder(orderId, newOrderDate, newSupplierId);
    }

    public void deleteOrder(int orderId) throws SQLException {
        orderService.deleteOrder(orderId);
    }


    public void addOrderDetail(int orderDetailId, int orderId, int productId, int quantity, double price) throws SQLException {
        orderDetailService.addOrderDetail(orderDetailId, orderId, productId, quantity, price);
    }

    public void updateOrderDetail(int orderDetailId, int newOrderId, int newProductId, int newQuantity, double newPrice) throws SQLException {
        orderDetailService.updateOrderDetail(orderDetailId, newOrderId, newProductId, newQuantity, newPrice);
    }

    public void deleteOrderDetail(int orderDetailId) throws SQLException {
        orderDetailService.deleteOrderDetail(orderDetailId);
    }

    // Inventory Methods
    public void addInventory(int inventoryId, int productId, int quantityOnHand) throws SQLException {
        inventoryService.addInventory(inventoryId, productId, quantityOnHand);
    }

    public void updateInventory(int inventoryId, int newProductId, int newQuantityOnHand) throws SQLException {
        inventoryService.updateInventory(inventoryId, newProductId, newQuantityOnHand);
    }

    public void deleteInventory(int inventoryId) throws SQLException {
        inventoryService.deleteInventory(inventoryId);
    }
    public void displayAllSuppliers() throws SQLException {
        supplierService.displayAllSuppliers();
    }

    public void displayAllProducts() throws SQLException {
        productService.displayAllProducts();
    }

    public void displayAllOrders() throws SQLException {
        orderService.displayAllOrders();
    }

    public void displayAllOrderDetails() throws SQLException {
        orderDetailService.displayAllOrderDetails();
    }

    public void displayAllInventories() throws SQLException {
        inventoryService.displayAllInventories();
    }
}
