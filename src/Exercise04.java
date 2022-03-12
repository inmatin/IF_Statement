/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Siju Philip
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Nov 12th, 2021
 * Modified: Nov 12th, 2021
 * Description: This class will get the user to enter the age of the customer 
 * and print the price of the ticket.
 */

import java.util.Scanner;

//main class Exercise04();
public class Exercise04 {

	/*
	 * comments needed
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Customer customer = new Customer();

		int age = 0;
		double price = 0.0;

		// Suggestion: get the inputs, use an if to check the age
		// if the age is invalid, just report an error and stop
		// if the age is valid, set the values into the object and
		// use the worker method to obtain the ticket price.
		// OR
		// detect if the returned price is less than zero and then
		// report an error message instead of a price.

		// print to get user to enter the age of the customer
		System.out.print("Please enter age of the Customer: ");

		// user input of age
		age = keyboard.nextInt();

		// set age=age
		customer.setAge(age);

		// get price value
		price = customer.ticketPrice();

		// price value is -1 then display error due to age is ivalid
		if (price == -1) {
			System.out.println("Invalid age entered. Please enter the correct age ");
		} else if (price == 0) {
			System.out.printf("Price: Free Admission\n");
		} else {
			System.out.printf("Price $%.2f%n", price);
		}

		// print name of the creator
		System.out.println("Program by Ishtiaque Matin ");
		keyboard.close();
	}
}
