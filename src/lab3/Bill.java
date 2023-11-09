/*
Assignment - 1
classname : Bill
data member : billno - int, description - string , 
sales_amount, discount, amt_afterdiscount - double
method:
readbill() : from the user read billno,description, 
sales_amount
calculatebill(): if sales_amount>50000, discount=10%, 
else discount=2%, then calculate amt_afterdiscount
showbill() : display all the datamember.
create 2 obkects to implement for 2 bills
*/

package lab3;

import java.util.Scanner;

public class Bill {
	//data members
	private int billNo;
	private String description;
	private double sales_amount;
	private double discount;
	private double amt_afterdiscount;
	//reading bill
	public void readBill() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter billno ");
		billNo = s.nextInt();
		s.nextLine();
		System.out.println("Enter description ");
		description = s.nextLine();
		System.out.println("Enter SalesAmount ");
		sales_amount = s.nextDouble(); 
		}
	//calculating bill
	public void calculatebill() {
		if(sales_amount>500000) {
			discount = 0.1; 
			} else {
				discount = 0.02; 
				}
		amt_afterdiscount = sales_amount -(sales_amount * discount);
		}
	//displaying all data members
	public void showBill() {
		System.out.println("Billno "+ billNo);
		System.out.println("Description "+description);
		System.out.println("Sales_amount "+sales_amount); 
		System.out.println("Discount "+ discount);
		System.out.println("Amt_afterdiscount "+amt_afterdiscount);
		}
	//creating 2 objects for 2 bills
	public static void main(String[] args) {
		Bill b1 =new Bill(); 
		b1.readBill();
        b1.calculatebill();
        b1.showBill();
        Bill b2 =new Bill();
        b2.readBill();
        b2.calculatebill();
        b2.showBill();
        }
	}
