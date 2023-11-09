/*
 * Assignment - 1
   Define a class Invoice with the following datamembers and methods
   invoiceId : inv1
   invoicePrice : 2300.50
   vendorName : vendor1
   invoiceName : abc ltd.
   location : Pune
   add a default constructor
   define following methods 
   addInvoice() - read from user
   displayInvoice() - display all datamembers
   create array objects to store 'n' no. of invoices
*/

package lab9;

import java.util.Scanner;

public class Invoice {
	//data members
	String invoiceId,vendorName, invoiceName,location;
	Double invoicePrice;
	//default constructor
	public Invoice() {
		invoiceId = "inv1";
        invoicePrice = 2300.50;
        vendorName = "vendor1";
        invoiceName = "abc ltd.";
        location = "Pune";
        }
	//add invoice method
	public void addInvoice() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Invoice_ID ");
		invoiceId = s.nextLine();
        System.out.print("Enter Invoice_Price ");
        invoicePrice = s.nextDouble();
        s.nextLine();
        System.out.print("Enter Vendor_Name ");
        vendorName = s.nextLine();
        System.out.print("Enter Invoice Name ");
        invoiceName = s.nextLine();
        System.out.print("Enter Location ");
        location = s.nextLine();
        }
	//display invoice method
	public void displayInvoice() {
		System.out.println("\nInvoice ID " + invoiceId);
		System.out.println("Invoice Price " + invoicePrice);
        System.out.println("Vendor Name " + vendorName);
        System.out.println("Invoice Name " + invoiceName);
        System.out.println("Location " + location);
        }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no.of invoices ");
		int n = s.nextInt();
		//create an array for Invoice objects
		Invoice[] invoices = new Invoice[n];
		for (int i = 0; i < n; i++) {
			invoices[i] = new Invoice();
			invoices[i].addInvoice();
			}
		//displaying invoice details 
		for (int i = 0; i < n; i++) {
			invoices[i].displayInvoice();
			}
		}
	}

