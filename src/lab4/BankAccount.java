/*
Assignment - 2
Write a Java program that allows the user to create a bank 
account and perform transactions
such as deposit, withdrawal, and balance inquiry. Using a 
conditional operator 
(ternary operator ), display the message whether minimum 
balance is maintained or not. Steps:
● Create a class BankAccount 
● Add three member variables: String accountHolderName ,
int accountNumber and int balance;
● Add a constructors using all three members 
● Add getters and setters.
● Add method deposit (int), withdraw(int) 
● Implement the methods by increasing or decreasing the 
balance 
● In the main method create a bank account 
● Withdraw money from this account and/or deposit into 
this account 
● Get the balance 
● Create a string variable “status” inside the main 
method
● Assign values to status as “Minimum Balance Maintained” 
if balance is above or equal to 5000. 
 Otherwise values of status will be “Minimum Balance not 
Maintained”. Use conditional operator (ternary operator ) 
to assign the values of the status. 
● Display the status
*/

package lab4;

public class BankAccount {
	// Creating member variables
	String accountHolderName;
	int accountNumber;
	int balance;
	// Using constructor
	public BankAccount(String acc_H_N, int acc_N, int bal) {
		accountHolderName = acc_H_N;
		accountNumber = acc_N;
		balance = bal;
		}
	// Adding getter and setter methods
	public String getAccountHolderName() {
		return accountHolderName;
		}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
		}
	public int getAccountNumber() {
		return accountNumber;
		}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
		}
	public int getBalance() {
		return balance;
		}
	public void setBalance(int balance) {
		this.balance = balance;
		}
	// Add deposit method
	public void deposit(int amount) {
		balance += amount;
		System.out.println("Deposited: " + amount);
		}
	// Add withdraw method
	public void withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
			} else {
				System.out.println("Insufficient balance!");
				}
		}
	//creating bank account
	public static void main(String[] args) {
		BankAccount account = new BankAccount("priya",123, 3000);
		account.deposit(3000);
		account.withdraw(6000);
		int currentBalance = account.getBalance();
		//creating string variable(status) and by using conditional operator
		String status = (currentBalance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";
		// displaying the status of bankaccount
		System.out.println("Current Balance: " + currentBalance);
		System.out.println("Status: " + status);
		}
	}

