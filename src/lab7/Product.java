/*
Assignment - 1
  class name   : Product
  data members : prdid, prddescription, batchcode, price, profit;
  method       : addproduct() with args assign the values to datamembers and display to user
         (with args and no return value)
  calculate_profit() if price>=10000 and <=100000 profit is 10% on price
  if price between 100000 to 500000 profit is 15% on price if price is >500000 profit is 20% 
  on price (with return type and no args)
*/
package lab7;

import java.util.Scanner;

public class Product {
	private int prdId;
    private String prdDescription, batchCode;
    private double price, profit;
    public void addProduct(int prdId, String prdDescription, String batchCode, double price) {
    	this.prdId = prdId;
        this.prdDescription = prdDescription;
        this.batchCode = batchCode;
        this.price = price;
        System.out.println("Product details");
        displayProductDetails();
        }
    public double calculateProfit() {
    	if (price >= 10000 && price <= 100000) {
    		profit = 0.10 * price;
    		} 
    	else if (price > 100000 && price <= 500000) {
    		profit = 0.15 * price;
    		} 
    	else if (price > 500000) {
    		profit = 0.20 * price;
    		} 
    	else {
    		profit = 0; 
    		}
    	return profit;
    	}
    public void displayProductDetails() {
    	System.out.println("PrdID - " + prdId);
        System.out.println("PrdDes - " + prdDescription);
        System.out.println("Batch_Code - " + batchCode);
        System.out.println("Price - " + price);
        System.out.println("Profit - " + calculateProfit());
        }
    public static void main(String[] args) {
    	Product pr = new Product();
    	pr.addProduct(1, "TV", "cd", 20000);
    	}
    }
