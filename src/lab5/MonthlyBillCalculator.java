/*
Assignment -1
1 . Write a program which calculates the monthly bill 
    amount for a internet subscriber based on the following 
    logic:
     1) If the total data consumed is less than 10 GB then  bill amount will be Rs. 300. (Basic charge)
     2) If the data consumed is between 10 GB and 30 GB then bill amount will be basic charge + 5* (Total GB consumed -10).
        That means consumers will be charged Rs 5 for each additional GB consumed over 10 GB.
     3) If the consumer consumes more than 30 GB then
        The bill amount = 400 + 3 *(Total GB consumed - 30).
        That means the consumer has to pay additional Rs 3 for each GB above 30GB.
    Use if-else block to solve the problem.
 */

package lab5;

import java.util.Scanner;

public class MonthlyBillCalculator {
	public static void main(String[] args) {
		//creating s object from users input
		Scanner s = new Scanner(System.in);
		System.out.print("Enter total data consumed in GB: ");
		//read users input data
		int totalConsumedData = s.nextInt();
		// calculated bill is stored in billAmount variable
		double billAmount;
		//Checking the conditions
		if (totalConsumedData < 10) {
			//consumedData is less than 10GB
			billAmount = 300;
			} else if (totalConsumedData <= 30) {
				//consumedData is in between 10GB to 30GB
				billAmount = 300 + 5 * (totalConsumedData -10);
				} else {
					//consumedData is more than 30GB
					billAmount = 400 + 3 * (totalConsumedData -30);
					}
		//displaying bill Amount
		System.out.println("Bill Amount: " + billAmount); 
		}
	}
