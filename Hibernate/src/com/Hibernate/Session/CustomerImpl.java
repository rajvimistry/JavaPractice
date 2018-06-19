package com.Hibernate.Session;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author Rajvi
 *
 */
public class CustomerImpl implements CustomerI {

	private static Configuration configuration = null;
	private static SessionFactory sessionFactory = null;
	static {
		System.out.println("Loding The Hibernate Configurations!!!!");
		configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		System.out.println("Hibernate Configurations Loaded Successfully");
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			// Serializable id = session.save(customer);
			session.persist(customer);
			transaction.commit();
			// System.out.println("Customer Object Persisted:" + id);
			System.out.println("Customer Object Persisted:");
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			try {
				if (session != null) {
					session.close();
				}
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void getCustomer(int customerid) {
		Session session = null;
		try {
			session = sessionFactory.openSession();

			Customer customer = (Customer) session.load(Customer.class, customerid);
			/*
			 * Customer customer = (Customer) session.get(Customer.class, customerId);
			 */
			System.out.println("*****************************************");
			System.out.println("The Customer Object You Are Looking For");
			System.out.println(customer);
			System.out.println("*****************************************");
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			try {
				if (session != null) {
					session.close();
				}
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void updateCustomer(Customer customer) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(customer);
			transaction.commit();
			System.out.println("Customer Object Updated:");
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			try {
				if (session != null) {
					session.close();
				}
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void removeCustomer(Customer customer) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(customer);
			transaction.commit();
			System.out.println("Customer Object Removed:");
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			try {
				if (session != null) {
					session.close();
				}
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
	}

}
