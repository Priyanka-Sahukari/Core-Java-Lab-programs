/*
Assignment (Lab 11)
● Write a Java program that demonstrates method 
overriding by creating a superclass 
 called Animal and two subclasses called Dog and Cat.
● The Animal class should have a method called 
makeSound(), which
 simply prints "The animal makes a sound."
● The Dog and Cat classes should override this method to 
print
 "TheCat/The dog meows/barks" respectively.
● The program should allow the user to create and display 
objects of each
 class
 */

package lab11;
//define a class
class Animal {
	//method for makesound
	void makeSound() {
		System.out.println("The animal makes a sound.");
		}
	}
//dog class extends Animal class
class Dog extends Animal {
	void makeSound() {
		System.out.println("The dog barks.");
		}
	}
//cat class extends Animal class
class Cat extends Animal {
	void makeSound() {
		System.out.println("The cat meows.");
		}
	}
