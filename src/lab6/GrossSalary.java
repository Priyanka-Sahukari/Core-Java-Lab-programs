/*
Assignment - 2
  Write a program to calculate the gross salary of a group of employees. Basic salary should be 
  taken from the user.
  If the basic salary is greater than 15000 ,HRA=20% and DA=60% will be given, else HRA=3000 
  and DA 70% will be given to the employee.
  Note:Input of basic salary will be taken from the keyboard. After calculating the salary of 
       one employee, the program will ask for the user's choice as int. If “-1” is entered 
       then the loop will continue and the loop will exit for other int inputs.
 */

package lab6;

import java.util.Scanner;

public class GrossSalary {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		float basic_sal, hra, da;
		int choice;
		do
		{
			System.out.println("Enter basic salary");
			basic_sal=s.nextFloat();
			if(basic_sal>15000)
			{
				hra=basic_sal*20/100;
				da= basic_sal*60/100;
				}
			else
			{
				hra=3000;
				da=basic_sal*70/100;
				}
			System.out.println("Hra "+ hra);
			System.out.println("Da "+ da);
			System.out.println("Do you want to continue then enter -1");
			choice=s.nextInt();
			if(choice!= -1)
			break;
			}
		while(choice== -1);
		System.out.println("Exit");
		}
	}

