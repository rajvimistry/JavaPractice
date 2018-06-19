package com.Hibernate.Session;

/**
 * @author Rajvi
 *
 */
public interface CustomerI {

	/**
	 * @param customer
	 * 
	 */
	public void saveCustomer(Customer customer);

	/**
	 * @param customerid
	 */
	public void getCustomer(int customerid);

	/**
	 * @param customer
	 */
	public void updateCustomer(Customer customer);

	/**
	 * @param customer
	 */
	public void removeCustomer(Customer customer);

}
