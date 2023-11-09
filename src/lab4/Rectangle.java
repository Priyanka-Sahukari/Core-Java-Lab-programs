/*
Assignment - 1
Write a Java program that uses a method to calculate the 
area of a rectangle and compare them using Relational 
Operator Steps:
● Create a class Rectangle. 
● The Rectangle class should have two attributes length 
and width of type int. 
● Create a constructor that accepts length and width as 
parameters. 
● Area should be calculated as length*area. 
● Instantiate two Rectangle classes with random values. 
● Compare the areas of the two rectangles using the 
Relational Operator. 
● If the first one is bigger than the second one, print 
“Rectangle1 > Rectangle2”. 
● If the first one is smaller print “Rectangle1 < 
Rectangle2”. 
● Otherwise print “They are equal”.
*/

package lab4;
//creating class
public class Rectangle {
	//attributes with type int
	int length;
	int width;
	int area;
	//using constructor
	public Rectangle(int leng, int wid) {
		length = leng;
		width = wid;
		}
	// calculating area
	public void calculate_area() {
		area = length * width;
		}
	//instantiating 2 rectangle classes
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(7, 3);
		Rectangle r2 = new Rectangle(4, 5);
		r1.calculate_area();
		r2.calculate_area();
        /*if (r1.area > r2.area) {
          System.out.println("r1 > r2");
           } else if (r1.area < r2.area) {
          System.out.println("r1 < r2");
          } else {
          System.out.println("They are equal");
          }
        */
		//using relational operators
		System.out.println("r1 " + (r1.area > r2.area ? ">" : r1.area < r2.area ? "<" : "==") + " r2");
		}
	}