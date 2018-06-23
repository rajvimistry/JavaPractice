package com.Customer.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Table;

/**
 * @author Rajvi
 *
 */

@SuppressWarnings("deprecation")
@Entity
@Table(appliesTo = "Customer")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private int customerId;
	@Column(name = "customerName", nullable = false, length = 20)
	private String customerName;
	@Column(name = "customerCity", nullable = false, length = 20)
	private String customerCity;
	@Column(name = "customerEmail", nullable = false, length = 30)
	private String customerEmail;

	/**
	 * @return customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @return customerEmail
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @return customerCity
	 */
	public String getCustomerCity() {
		return customerCity;
	}

	/**
	 * @return customerEmail
	 */
	public String getCustomerEmail() {
		return customerEmail;
	}

	/**
	 * @param customerId
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @param customerName
	 */
	public void setCustomerCity(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @param customerCity
	 */
	public void setCustomerName(String customerCity) {
		this.customerCity = customerCity;
	}

	/**
	 * @param customerEmail
	 */
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + ", customerEmail=" + customerEmail + "]";
	}
}
