/*
Assignment (Lab 6) 
1.Write a program to find out all the armstrong numbers within a givenrange using a method named
  printArmstrongNumber( int start, intend) by taking input from the user. The program should 
  print the Armstrong number in a given range starting from “start” and ending with “end”.
  Note: input should be taken from the keyboard. Use a loop to calculate the Armstrong number
        from “start” to “end”. Also use loops to calculate the cube of a number. Do not use the 
        Math.pow() function
 */

package lab6;

import java.util.Scanner; 

public class ArmstrongNumber{ 
	public static void main(String[] args) { 
		//start and end limits from user 
		Scanner s = new Scanner(System.in); 
		int start, end; 
		System.out.println("Enter Start limit ");
		start = s.nextInt(); 
		System.out.println("Enter End limit "); 
		end = s.nextInt(); 
		//flag is used to find if the number is armstrong 
		boolean flag = false; 
		// iterating range of numbers 
		for (int i = start; i <= end; i++) { 
			if (isArmstrong(i)) { 
				//printing the Armstrong number
				System.out.println(i); 
				//flag is used to set true
				flag = true; 
				} 
			} 
		//checking no armstrong number is found 
		if (!flag) 
			System.out.println("No Armstrong numbers found" + start + " to " + end); 
		} 
	// it is a method to check if a number is Armstrong number
	public static boolean isArmstrong(int num) { 
		int n1 = num; int count = 0; 
		// Counting the no.of digits 
		while (n1 > 0){
			n1 /= 10; count++; 
			} 
		int n2 = num; 
		int sum = 0; 
		// checking if it is Armstrong number by using while loop 
		while (n2> 0) { 
			int r = n2 % 10;
			int p = 1; 
			//calculating power of every digit 
			for (int j = 1; j <= count; j++) 
				p*= r; 
			//making the sum 
			sum += p; n2 /= 10; 
			} 
		//checking the sum of powers is equal to number 
		return sum == num; 
		}
	}
