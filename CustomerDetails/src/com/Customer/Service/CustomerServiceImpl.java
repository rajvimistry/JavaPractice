package com.Customer.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.Customer.Controller.CustomerBusinessException;
import com.Customer.CustomerDAO.CustomerDAO;
import com.Customer.CustomerDAO.CustomerI;
import com.Customer.Exception.CustomerException;
import com.Customer.Model.Customer;

/**
 * @author Rajvi
 *
 */
public class CustomerServiceImpl implements CustomerServiceI {

	private CustomerI customerDao;

	/**
	 * 
	 */
	public CustomerServiceImpl() {
		customerDao = new CustomerDAO();
	}

	@Override
	public boolean SaveCustomer(Customer customer) throws CustomerException, CustomerBusinessException {
		boolean regFlag = false;
		boolean nameFlag = validateCustomerName(customer.getCustomerCity());
		if (nameFlag == true) {
			regFlag = customerDao.SaveCustomer(customer);
		}
		return regFlag;
	}

	private boolean validateCustomerName(String name) throws CustomerBusinessException {
		boolean empNameFlag = false;
		String pattern = "^[a-zA-Z]+$";
		Pattern myPattern = Pattern.compile(pattern);
		Matcher matcher = myPattern.matcher(name);
		if (!matcher.matches()) {
			throw new CustomerBusinessException("White Space and Special Characters are not allowed");
		} else {
			empNameFlag = true;
		}
		return empNameFlag;
	}

	@Override
	public List<Customer> customerList() throws CustomerException, CustomerBusinessException {
		List<Customer> customerList = null;
		customerList = customerDao.customerList();
		if (customerList.isEmpty()) {
			throw new CustomerBusinessException("No Customers Found");
		}
		return customerList;
	}

}
