/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Siju Philip
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Nov 12th, 2021
 * Modified: Nov 12th, 2021
 * Description: This class will calculate the price of the ticket using the age
 * entered by the user
 */

// constructor Customer ();
public class Customer {
	private int age;

	// constructor Customer();
	public Customer() {
		this(0);
	}

	// this.age=age
	public Customer(int age) {
		this.age = age;
	}

	// getAge=age
	public int getAge() {
		return age;
	}

	// setAge= new age value
	public void setAge(int age) {
		this.age = age;
	}

	// method ticketPrice();
	// a return value of -1 indicates invalid age entered
	public double ticketPrice() {
		double price = -1.0; // set to -1 in case the age is invalid.

		// if age is less that zero, or greater that or equal to 130 return -1.0
		if (age < 0 || age >= 130) {
			price = -1.0;
		}

		// if age is less 2 then price is 0
		else if (age < 2) {
			price = 0.0;
		}

		// if age is greater than or equal to 18 then price is 15
		else if (age <= 18) {
			price = 15.0;
		}

		// if age is less than or equal to 65 then price is 20
		else if (age < 65) {
			price = 20.0;
		}

		// if age does not meet any of the above requirements than price is 12
		else {
			price = 12.0;
		}

		// return calculated price
		return price;

	}

}
