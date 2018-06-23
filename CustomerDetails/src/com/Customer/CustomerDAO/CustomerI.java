package com.Customer.CustomerDAO;

import java.util.List;

import com.Customer.Exception.CustomerException;
import com.Customer.Model.Customer;

/**
 * @author Rajvi
 *
 */
public interface CustomerI {

	/**
	 * @param customer
	 * @return isSave
	 * @throws CustomerException
	 */
	public boolean SaveCustomer(Customer customer) throws CustomerException;

	/**
	 * @return customerList
	 * @throws CustomerException
	 */
	public List<Customer> customerList() throws CustomerException;
}
