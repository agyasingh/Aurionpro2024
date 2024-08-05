package com.aurionpro.violation.test;

import java.util.Scanner;

import com.aurionpro.violation.model.Invoice;
import com.aurionpro.violation.model.InvoicePrinter;
import com.aurionpro.violation.model.TaxCalculator;

public class InvoiceTest {
	private static Scanner scanner=new Scanner(System.in);
	
public static void main(String[] args) {
	
	System.out.println("Enter id");
	int id=scanner.nextInt();
	System.out.println("Enter description");
	String description=scanner.next();
	System.out.println("Enter amount");
	double amount=scanner.nextDouble();
	System.out.println("Enter tax");
	double tax=scanner.nextDouble();
	
    Invoice invoice=new Invoice(id,description,amount,tax);

	TaxCalculator taxCalculator=new TaxCalculator(invoice);
	
	taxCalculator.calculateTax();
	
	InvoicePrinter invoiceprinter=new InvoicePrinter(invoice, taxCalculator);
	
	invoiceprinter.displayInvoice();
}
}
