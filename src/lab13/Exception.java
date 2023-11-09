/*
Assignment (Lab – 13)
 Create a custom exception class to check the number is non zero value.
 implement in a class which find square of given number.
*/

package lab13;
//Custom exception class
class NonZeroException extends Exception {
	public NonZeroException(String message) {
		super(message);
		}
	}
//class to find square of number
class SquareOfNumber {
	public static int findSquare(int number) throws
	NonZeroException {
		//check if number is non-zero
		if (number == 0) {
			throw new NonZeroException("Number cannot be zero.");
			}
		// Calculate and return the square
		return number * number;
		}
	}

