package com.aurionpro.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.aurionpro.model.Facade;
import com.aurionpro.model.InventoryService;
import com.aurionpro.model.OrderDetailService;
import com.aurionpro.model.OrderService;
import com.aurionpro.model.ProductService;
import com.aurionpro.model.SupplierService;

public class Main {
	
	public static void main(String[] args) {
		 	SupplierService supplierService = new SupplierService();
	        ProductService productService = new ProductService(supplierService);
	        OrderService orderService = new OrderService(supplierService);
	        OrderDetailService orderDetailService = new OrderDetailService(orderService, productService);
	        InventoryService inventoryService = new InventoryService(productService);
		Facade facade = new Facade(supplierService, productService, orderService, orderDetailService, inventoryService);
		Scanner scanner = new Scanner(System.in);
		 while (true) {
	            System.out.println("Choose an operation:");
	            System.out.println("1. Add Supplier");
	            System.out.println("2. Update Supplier");
	            System.out.println("3. Delete Supplier");
	            System.out.println("4. Display All Suppliers");  // New
	            System.out.println("5. Add Product");
	            System.out.println("6. Update Product");
	            System.out.println("7. Delete Product");
	            System.out.println("8. Display All Products");  // New
	            System.out.println("9. Add Order");
	            System.out.println("10. Update Order");
	            System.out.println("11. Delete Order");
	            System.out.println("12. Display All Orders");  // New
	            System.out.println("13. Add Order Detail");
	            System.out.println("14. Update Order Detail");
	            System.out.println("15. Delete Order Detail");
	            System.out.println("16. Display All Order Details");  // New
	            System.out.println("17. Add Inventory");
	            System.out.println("18. Update Inventory");
	            System.out.println("19. Delete Inventory");
	            System.out.println("20. Display All Inventories");  // New
	            System.out.println("21. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline
	            try {
	               
				switch (choice) {
				case 1:
					System.out.print("Enter Supplier ID: ");
					int supplierId = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter Supplier Name: ");
					String name = scanner.nextLine();
					System.out.print("Enter Contact Info: ");
					String contactInfo = scanner.nextLine();
					System.out.print("Enter Address: ");
					String address = scanner.nextLine();
					facade.addSupplier(supplierId, name, contactInfo, address);
					break;
				case 2:
					System.out.print("Enter Supplier ID: ");
					supplierId = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter New Supplier Name: ");
					name = scanner.nextLine();
					System.out.print("Enter New Contact Info: ");
					contactInfo = scanner.nextLine();
					System.out.print("Enter New Address: ");
					address = scanner.nextLine();
					facade.updateSupplier(supplierId, name, contactInfo, address);
					break;
				case 3:
					System.out.print("Enter Supplier ID to delete: ");
					supplierId = scanner.nextInt();
					facade.deleteSupplier(supplierId);
					break;
				case 4:
	                    facade.displayAllSuppliers();
	                    break;
				case 5:
					System.out.print("Enter Product ID: ");
					int productId = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter Product Name: ");
					String productName = scanner.nextLine();
					System.out.print("Enter Product Description: ");
					String description = scanner.nextLine();
					System.out.print("Enter Supplier ID: ");
					int supplierIdForProduct = scanner.nextInt();
					facade.addProduct(productId, productName, description, supplierIdForProduct);
					break;
				case 6:
					System.out.print("Enter Product ID: ");
					productId = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter New Product Name: ");
					productName = scanner.nextLine();
					System.out.print("Enter New Product Description: ");
					description = scanner.nextLine();
					System.out.print("Enter New Supplier ID: ");
					int newSupplierId = scanner.nextInt();
					facade.updateProduct(productId, productName, description, newSupplierId);
					break;
				case 7:
					System.out.print("Enter Product ID to delete: ");
					productId = scanner.nextInt();
					facade.deleteProduct(productId);
					break;
				case 8:
	                facade.displayAllProducts();
	                break;
				case 9:
					System.out.print("Enter Order ID: ");
					int orderId = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter Order Date (YYYY-MM-DD): ");
					String orderDate = scanner.nextLine();
					System.out.print("Enter Supplier ID: ");
					int supplierIdForOrder = scanner.nextInt();
					facade.addOrder(orderId, orderDate, supplierIdForOrder);
					break;
				case 10:
					System.out.print("Enter Order ID: ");
					orderId = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter New Order Date (YYYY-MM-DD): ");
					orderDate = scanner.nextLine();
					System.out.print("Enter New Supplier ID: ");
					newSupplierId = scanner.nextInt();
					facade.updateOrder(orderId, orderDate, newSupplierId);
					break;
				case 11:
					System.out.print("Enter Order ID to delete: ");
					orderId = scanner.nextInt();
					facade.deleteOrder(orderId);
					break;
				case 12:
                    facade.displayAllOrders();
                    break;	
				case 13:
					System.out.print("Enter Order Detail ID: ");
					int orderDetailId = scanner.nextInt();
					System.out.print("Enter Order ID: ");
					orderId = scanner.nextInt();
					System.out.print("Enter Product ID: ");
					productId = scanner.nextInt();
					System.out.print("Enter Quantity: ");
					int quantity = scanner.nextInt();
					System.out.print("Enter Price: ");
					double price = scanner.nextDouble();
					facade.addOrderDetail(orderDetailId, orderId, productId, quantity, price);
					break;
				case 14:
					System.out.print("Enter Order Detail ID: ");
					orderDetailId = scanner.nextInt();
					System.out.print("Enter New Order ID: ");
					orderId = scanner.nextInt();
					System.out.print("Enter New Product ID: ");
					productId = scanner.nextInt();
					System.out.print("Enter New Quantity: ");
					quantity = scanner.nextInt();
					System.out.print("Enter New Price: ");
					price = scanner.nextDouble();
					facade.updateOrderDetail(orderDetailId, orderId, productId, quantity, price);
					break;
				case 15:
					System.out.print("Enter Order Detail ID to delete: ");
					orderDetailId = scanner.nextInt();
					facade.deleteOrderDetail(orderDetailId);
					break;
				case 16:
                    facade.displayAllOrderDetails();
                    break;
				case 17:
					System.out.print("Enter Inventory ID: ");
					int inventoryId = scanner.nextInt();
					System.out.print("Enter Product ID: ");
					productId = scanner.nextInt();
					System.out.print("Enter Quantity on Hand: ");
					int quantityOnHand = scanner.nextInt();
					facade.addInventory(inventoryId, productId, quantityOnHand);
					break;
				case 18:
					System.out.print("Enter Inventory ID: ");
					inventoryId = scanner.nextInt();
					System.out.print("Enter New Product ID: ");
					productId = scanner.nextInt();
					System.out.print("Enter New Quantity on Hand: ");
					quantityOnHand = scanner.nextInt();
					facade.updateInventory(inventoryId, productId, quantityOnHand);
					break;
				case 19:
					System.out.print("Enter Inventory ID to delete: ");
					inventoryId = scanner.nextInt();
					facade.deleteInventory(inventoryId);
					break;
				 case 20:
	                    facade.displayAllInventories();
	                    break;
				case 21:
					System.out.println("Exiting...");
					scanner.close();
					return;
				default:
					System.out.println("Invalid choice. Try again.");
				}
			} catch (SQLException e) {
				System.err.println("SQL Error: " + e.getMessage());
			}
		}
	}	
}