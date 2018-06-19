package com.Hibernate.Cache;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 * @author Rajvi
 *
 */
public class FirstLevelCache {

	private static Configuration configuration = null;
	private static SessionFactory sessionFactory = null;
	static {
		System.out.println("Loding The Hibernate Configurations!!!!");
		// configuration = new Configuration();
		configuration = new AnnotationConfiguration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		System.out.println("Hibernate Configurations Loaded Successfully");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("I Am From FirstLevelCacheExample Class ");
		try {
			Session session = sessionFactory.openSession();
			CustomerCache customer = (CustomerCache) session.get(CustomerCache.class, 102);
			System.out.println("************************************");
			System.out.println("Customer Object First Time Call");
			System.out.println(customer);
			System.out.println("*************************************");
			CustomerCache customer1 = (CustomerCache) session.get(CustomerCache.class, 102);
			System.out.println("************************************");
			System.out.println("Customer Object Second Time Call");
			System.out.println(customer1);
			System.out.println("*************************************");
			session.close();
			Session session1 = sessionFactory.openSession();
			CustomerCache customer2 = (CustomerCache) session1.get(CustomerCache.class, 102);
			System.out.println("************************************");
			System.out.println("Customer Object Third Time Call After Closing the Session");
			System.out.println(customer2);
			System.out.println("*************************************");
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
