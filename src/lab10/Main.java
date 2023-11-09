package lab10;

class Main {
	public static void main(String[] args) {
		// Instantiate car
		Car myCar = new Car("Ferrari", "carrel", 2002, 295);
		//call drive method for Car
		myCar.drive();
		//printing Car attributes
		System.out.println("Car Attributes " + myCar.make+ ", " + myCar.model + ", " + myCar.year + ", " + myCar.maximumSpeed);
		//instantiate bike
		Bike myBike = new Bike("Yamaha", "CR", 2022, 186);
		//call drive method for Bike
		myBike.drive();
		//printing Bike attributes
		System.out.println("Bike Attributes " + myBike.make + ", " + myBike.model + ", " + myBike.year + ", " + myBike.maximumSpeed);
		}
	}