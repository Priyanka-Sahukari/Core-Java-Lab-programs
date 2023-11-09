/*
Assignment-1.
● Write a Java program named Car
● The Car class should have the following attributes: make 
(String), model
(String) , year (short) , and price(int) .
● The car class should have a constructor that takes all 
the attributes.
● Add a main method to instantiate car objects.
● The program should allow the user to create and display 
objects of each
*/

package lab2;

public class Car {
	//Attributes
	String make;
	String model;
	short year;
	int price;
	//Constructor
	public Car (String make,String model,short year,int price) {
		this.make=make;
		this.model=model;
	    this.year=year;
	    this.price=price;
	    System.out.println(make+" "+model+" "+year+" "+price);
	    }
	//instantiating main method
    public static void main(String[] args) {
    	//Creating Objects and displaying
        Car c=new Car("maruthi suzuki","dzire",(short)2000,6500000);
        }
}
