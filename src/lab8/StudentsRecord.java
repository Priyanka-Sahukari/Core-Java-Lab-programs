/*
Assignment 1
read and store student records with rollno, name, 
average marks 
of 10 students using arrays. and display the
same to user. display the student list who are scored 
above 60 as average marks.
*/

package lab8;

import java.util.Scanner;
public class StudentsRecord {
	public static void main(String[] args) {
		// Declaring arrays 
		int[] rollNos = new int[10];
		String[] names = new String[10];
		double[] averageMarks = new double[10];
		Scanner s = new Scanner(System.in);
		// users input
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter details for Student " + (i + 1)); 
			System.out.print("Roll No ");
			rollNos[i] = s.nextInt(); 
			System.out.print("Name ");
			names[i] = s.next(); 
			System.out.print("Average Marks ");
			averageMarks[i] = s.nextDouble();
			}
		// Displaying all student list and \n used for new line,\t used for columns
		System.out.println("All Students list \n");
		System.out.println("Roll No\tName\tAverage Marks");
		for (int i = 0; i < 10; i++) {
			System.out.println(rollNos[i] + "\t" + names[i] + "\t" + averageMarks[i]);
			}
		// Displaying students scored above 60 average marks
		System.out.println("Students scored above 60 average marks \n");
		System.out.println("Roll No\tName\tAverage Marks");
		for (int i = 0; i < 10; i++) {
			if (averageMarks[i] > 60) {
				System.out.println(rollNos[i] + "\t" + 
			names[i] + "\t" + averageMarks[i]);
				}
			}
		s.close();
		}
	}
