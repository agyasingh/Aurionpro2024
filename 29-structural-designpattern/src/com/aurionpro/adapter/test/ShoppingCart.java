package com.aurionpro.adapter.test;

import java.util.List;
import com.aurionpro.adapter.model.IItems;

public class ShoppingCart {

    private List<IItems> cartItems;

    public ShoppingCart(List<IItems> cartItems) {
        this.cartItems = cartItems;
    }
    
    // Adds an item to the cart
    public void addItemToCart(IItems item) {
        cartItems.add(item);
    }
    
    // Returns the list of items in the cart
    public List<IItems> getCartItems() {
        return cartItems;
    }
    
    // Returns the total price of items in the cart
    public double getCartPrice() {
        double totalPrice = 0.0;
        for (IItems item : cartItems) {
            totalPrice += item.getItemPrice(); // Assuming IItems has a getPrice() method
        }
        return totalPrice;
    }
}

