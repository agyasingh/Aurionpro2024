//package com.aurionpro.adapter.test;
//
//import java.util.ArrayList;
//import java.util.List;
//import com.aurionpro.adapter.model.IItems;
//
//
//public class ShoppingcartTest{
//    public static void main(String[] args) {
//        // Create a list to hold items
//        List<IItems> itemList = new ArrayList<>();
//
//        // Create some items
//        IItems apple = new IItems("Apple", 1.00);
//        IItems banana = new IItems("Banana", 0.75);
//        IItems orange = new IItems("Orange", 1.25);
//
//        // Add items to the list
//        itemList.add(apple);
//        itemList.add(banana);
//        itemList.add(orange);
//
//        // Create a ShoppingCart object with the items
//        ShoppingCart cart = new ShoppingCart(itemList);
//
//        // Add more items to the cart
//        cart.addItemToCart(new IItems("Grapes", 2.00));
//
//        // Print the items in the cart
//        System.out.println("Items in cart:");
//        for (IItems item : cart.getCartItems()) {
//            System.out.println(item);
//        }
//
//        // Print the total price of the cart
//        System.out.printf("Total price: $%.2f%n", cart.getCartPrice());
//    }
//}
