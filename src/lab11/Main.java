package lab11;
public class Main {
	//main method
	public static void main(String[] args) {
		//creating object of Animal class
		Animal a = new Animal();
		//creating object of Dog class
		Dog d = new Dog();
		//creating object of Cat class
		Cat c = new Cat();
		//displaying a sound of animal
		System.out.println("Animal Sound ");
		a.makeSound();
		//displaying a sound of Dog
		System.out.println("\nDog Sound ");
		d.makeSound();
		//displaying a sound of Cat
		System.out.println("\nCat Sound ");
		c.makeSound();
		}
	}

