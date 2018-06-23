package com.Customer.Controller;

/**
 * @author Rajvi
 *
 */
public class CustomerBusinessException extends Exception {

	/**
	 * 
	 */
	public CustomerBusinessException() {
		super();
	}

	/**
	 * @param message
	 */
	public CustomerBusinessException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public CustomerBusinessException(Throwable cause) {
		super(cause);
	}

}
