/*
Assignment-2
● Create a new class Employee 
● Add member variables: id and age of type int, name of 
type String and isPermanent of type boolean 
● Now assign values 35.5 to age; See the error message.
● How can you avoid this error? Correct the error by 
casting. 
● Make all the members protected 
● Add a main method to it. Print message “Successfully 
started”. 
● Compile the class.
*/

package lab1;
 
class Employee {
	//Member variables 
    protected int id; 
    /*assigning 35.5 to age.here we get error. 
     so,to avoid this error - using type casting 
     making member variables as protected
    */
    protected int age = (int)35.5; 
    protected String Name; 
    protected Boolean isPermanent;
 //Adding main method
 public static void main(String[] args) {
	 //printing Successfully started
      System.out.println("Successfully started");
       } 
}