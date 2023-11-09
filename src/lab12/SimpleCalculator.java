/*
Assignment - 12
1.Create a Java program that acts as a simple calculator.
  ● The program should prompt the user to enter two numbers and an operator (+, -, *, /).
  ● Perform the corresponding calculation based on the operator.
  ● Handle potential exceptions, such as division by zero or invalid operator input.
  ● Display the result or an appropriate error message.
*/

package lab12;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			//user can enter two numbers
			System.out.print("Enter first number ");
			double num1 = s.nextDouble();
			System.out.print("Enter second number ");
			double num2 = s.nextDouble();
			//user can enter an operator
			System.out.print("Enter the operator (+, -, *, /): ");
			char operator = s.next().charAt(0);
			//calculation based on the operator
			double result = 0;
			switch (operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
					result = num1 - num2;
					break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				//handling division by zero
				if (num2 == 0) {
					throw new
					ArithmeticException("Cannot divide by zero.");
					}
				result = num1 / num2;
				break;
			default:
				throw new
				IllegalArgumentException("Invalid operator. Please enter +, -, *, or /.");
				}
			//displaying result
			System.out.println("Result " + result);
			} catch (Exception e) {
				//displaying appropriate error messages
				System.err.println("Error " + e.getMessage());
				} finally {
					s.close();
					}
		}
	}

