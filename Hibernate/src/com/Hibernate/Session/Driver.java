package com.Hibernate.Session;

import java.util.Scanner;

/**
 * @author Rajvi
 *
 */
public class Driver {

	private static void getUserMenu() {
		System.out.println("**************************");
		System.out.println("Save) Save Module");
		System.out.println("Load) Load Module");
		System.out.println("Remove) Remove Module");
		System.out.println("Update) Update Module");
		System.out.println("**************************");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter User Choice");
		String userChoice = scanner.next();
		CustomerI iCustomer = new CustomerImpl();
		switch (userChoice) {
		case "Save":
			Customer customer = new Customer();
			// customer.setCustomerId(102);
			customer.setCustomerCity("Binghamton");
			customer.setCustomerName("Rajvi J.");
			iCustomer.saveCustomer(customer);
			break;
		case "Load":
			System.out.println("Enter Customer Id");
			int customerId = scanner.nextInt();
			iCustomer.getCustomer(customerId);
			break;
		case "Remove":
			System.out.println("Enter Customer Id To Remove");
			customerId = scanner.nextInt();
			Customer customer2 = new Customer();
			customer2.setCustomerId(customerId);
			iCustomer.removeCustomer(customer2);
			break;

		case "Update":
			Customer customer1 = new Customer();
			customer1.setCustomerId(101);
			customer1.setCustomerCity("New York City");
			customer1.setCustomerName("Rajvi Mistry");
			iCustomer.updateCustomer(customer1);
			break;

		default:
			System.out.println("Enter Correct Choice");
			System.exit(0);
			break;
		}
		scanner.close();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("I AM From Main Method");
		getUserMenu();
		System.out.println("End Of Main Method");
	}

}
