/*
Assignment-2
Define a student class with following data members
Idno, name, course and average
Add methods to read and display the student data.
*/

package lab2;

import java.util.Scanner;

public class Student {
	//Data members
	int Idno;
	String name;
	String course;
	float average;
	//to read the student data
    public void readdata() {
    	Scanner obj = new Scanner(System.in);
    	System.out.println("Enter Idno:");
    	Idno=obj.nextInt();
    	System.out.println("Enter name:");
    	name=obj.next();
    	System.out.println("Enter course:");
    	course=obj.next();
    	System.out.println("Enter average:");
    	average=obj.nextFloat();
    	}
    //for display student data
    public void showdata() { 
    	System.out.println("ID "+Idno);
    	System.out.println("Name "+name);
    	System.out.println("Course "+course);
    	System.out.println("Avg "+average);
    	}
    public static void main(String[] args) {
    	//creating obj for student
    	Student s= new Student();
    	//reading the student data
    	s.readdata();
    	//showing the student data
    	s.showdata();
    	}
}