package com.Customer.CustomerDAO;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Customer.Database.DBUtil;
import com.Customer.Exception.CustomerException;
import com.Customer.Model.Customer;

/**
 * @author Rajvi
 *
 */
public class CustomerDAO implements CustomerI {

	@Override
	public boolean SaveCustomer(Customer customer) throws CustomerException {
		boolean regFlag = false;
		SessionFactory sessionfactory = null;
		Session session = null;
		try {
			sessionfactory = DBUtil.getSessionFactory();
			session = sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();
			Serializable customerId = session.save(customer);
			transaction.commit();
			regFlag = true;
		} catch (HibernateException e) {
			throw new CustomerException();
		} finally {
			try {
				if (session != null) {
					session.close();
				}
				if (sessionfactory != null) {
					sessionfactory.close();
				}
			} catch (HibernateException e) {

			}
		}
		return regFlag;
	}

	@Override
	public List<Customer> customerList() throws CustomerException {
		List<Customer> customerList = null;
		SessionFactory sessionfactory = null;
		Session session = null;
		try {
			sessionfactory = DBUtil.getSessionFactory();
			session = sessionfactory.openSession();
			Query query = session.createQuery("From Customer");
			customerList = query.list();
		} catch (HibernateException e) {
			throw new CustomerException(e);
		} finally {
			try {
				if (session != null) {
					session.close();
				}
				if (sessionfactory != null) {
					sessionfactory.close();
				}
			} catch (HibernateException e) {

			}
		}
		session.close();
		return customerList;
	}

}
