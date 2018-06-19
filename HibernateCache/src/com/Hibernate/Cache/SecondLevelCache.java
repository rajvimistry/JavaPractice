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
public class SecondLevelCache {

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

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Waiting For 5 Seconds");

			Session session1 = sessionFactory.openSession();
			CustomerCache customer2 = (CustomerCache) session1.get(CustomerCache.class, 102);
			System.out.println("************************************");
			System.out.println("Customer Object Third Time Call After Closing the Session");
			System.out.println("Loading From Second Level Cache");
			System.out.println(customer2);
			System.out.println("*************************************");
			session1.close();
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Session session2 = sessionFactory.openSession();
			CustomerCache customer3 = (CustomerCache) session2.get(CustomerCache.class, 102);
			System.out.println("************************************");
			System.out.println("Customer Object 4th Time Call After Closing the Session2");
			System.out.println("Loading From Data Base ");
			System.out.println(customer3);
			System.out.println("*************************************");
			session2.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

}
