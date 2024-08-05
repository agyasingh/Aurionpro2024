//package com.aurionpro.adapter.model;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class HatAdapter extends Hat implements IItems {
//    private static Scanner scanner = new Scanner(System.in);
//	private String name;
//
//    // Constructor that initializes the parent class
//    public HatAdapter(String shortname, String longname, int baseprice, double tax) {
//        super(shortname, longname, baseprice, tax);
//    }
//
//
//
//    // Method to add an item to the list, returns an IItems object
//    public IItems addItemToList() {
//       
//
//        System.out.println("Enter long name:");
//        String longname = scanner.next();
//        
//        System.out.println("Enter short name:");
//        String shortname = scanner.next();
//        
//        System.out.println("Enter base price:");
//        int baseprice = scanner.nextInt();
//        
//        System.out.println("Enter tax:");
//        double tax = scanner.nextDouble();
//
//        // Create a new HatAdapter object with the provided details
//        HatAdapter newItem = new HatAdapter(shortname, longname, baseprice, tax, name);
//        
//        return newItem;
//    }
//
//    @Override
//    public String getItemName() {
//        if (shortname == null && longname == null) {
//            return this.name;
//        }
//        return shortname + " " + longname;
//    }
//
//    @Override
//    public int getItemPrice() {
//        return (int) (baseprice + tax);
//    }
//}
