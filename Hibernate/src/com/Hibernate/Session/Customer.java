package com.Hibernate.Session;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

/**
 * @author Rajvi
 *
 */
@Entity
@Table(appliesTo = "Customer")
public class Customer implements Serializable {

	@Id
	@Column(name = "CustomerId")
	private int customerId;
	// @Column(name = "CustomerName")
	private String customerName;
	// @Column(name = "CustomerCity")
	private String customerCity;

	/**
	 * @param customerId
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @param customerName
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @param customerCity
	 */
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	/**
	 * @return customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @return customerName
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

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + "]";
	}

}
