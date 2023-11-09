package lab13;

public class Main {
	public static void main(String[] args) {
		try {
			int inputNumber = 3;
			int result = SquareOfNumber.findSquare(inputNumber);
			System.out.println("Square of " + inputNumber + " is " + result);
			} catch (NonZeroException e) {
				System.err.println("Error " + e.getMessage());
				}
		}
	}

