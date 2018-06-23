package com.Customer.Service;

import java.util.List;

import com.Customer.Controller.CustomerBusinessException;
import com.Customer.Exception.CustomerException;
import com.Customer.Model.Customer;

/**
 * @author Rajvi
 *
 */
public interface CustomerServiceI {

	/**
	 * @param customer
	 * @return isSave
	 * @throws CustomerBusinessException
	 * @throws CustomerException
	 */
	public boolean SaveCustomer(Customer customer) throws CustomerBusinessException, CustomerException;

	/**
	 * @return customerList
	 * @throws CustomerBusinessException
	 * @throws CustomerException
	 */
	public List<Customer> customerList() throws CustomerBusinessException, CustomerException;

}
