/*
Assignmemt - 3
   Write a program to count and print the total number of odd and even numbers from user inputs. 
   Program will ask for user inputs in a loop.
 */

package lab6;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count_even = 0;
		int count_odd = 0;
		//input variable to store users input
		char input;
		do {
			System.out.print("Enter number: ");
			int num = s.nextInt();
			//checking number is even or odd
			if (num % 2 == 0) {
				count_even++;
				} 
			else {
				count_odd++;
				}
			//asking the users input for entering another input
			System.out.print("Do you want to enter another number? (y/n): ");
			input = s.next().charAt(0);
			//if user enter the y or Y , for continuing loop
			} 
		while (input== 'y' || input== 'Y');
		System.out.println("Count of even numbers " + count_even);
		System.out.println("Count of odd numbers " + count_odd);
		s.close();
		}
	}
