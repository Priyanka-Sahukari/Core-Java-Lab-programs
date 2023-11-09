/*
Assignment 1
1.
 ● Write a Java program to create a class called Vehicle 
with a method called 
 drive().
 ● Vehicle should have attributes such as make (String), 
model (String) ,
 year (int) and maximumSpeed (int).
 ● Create a constructor in Vehicle with all fields as 
constructor parameters.
 ● Create a subclass called Car and override constructor. 
Call super(). 
 ● Write a function that overrides the drive() method to 
print (make + “ ” +
 model + " Car is driving". )
 ● Also create another subclass Bike extending the 
vehicle class. 
 ● Override the drive() method to print (make + “ ” + 
model + " Bike is
 driving". )
 ● Instantiate both Bike and Car class. Print their 
attributes.
*/

package lab10;
// Define the Vehicle class
public class Vehicle {
	// Attributes of vehicle
	String make, model;
	int year, maximumSpeed;
	// Constructor for the Vehicle with all fields as parameters
	public Vehicle(String make, String model, int year,int maximumSpeed) {
		this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
        }
	// Drive method for the Vehicle class
	public void drive() {
		System.out.println(make + " " + model + " is driving");
		}
	}
//define Car class, which is a subclass of Vehicle
class Car extends Vehicle {
	//constructor for the Car class
	public Car(String make, String model, int year, int maximumSpeed) {
		//call the constructor of the superclass
		super(make, model, year, maximumSpeed);
		}
	// Override the drive method for Car
	public void drive() {
		System.out.println(make + " " + model + " Car is driving");
		}
	}
//define the Bike class, which is a subclass of Vehicle
class Bike extends Vehicle {
	//constructor for the Bike class
	public Bike(String make, String model, int year, int maximumSpeed) {
		// Call the constructor of the superclass (Vehicle)
		super(make, model, year, maximumSpeed);
		}
	// Override the drive method for Bike
	public void drive() {
		System.out.println(make + " " + model + " Bike is driving");
		}
	}

