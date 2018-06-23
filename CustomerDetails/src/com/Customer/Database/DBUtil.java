package com.Customer.Database;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 * @author Rajvi
 *
 */
public final class DBUtil {

	private DBUtil() {
	}

	/**
	 * @return sessionfactory
	 */
	public static SessionFactory getSessionFactory() {
		SessionFactory sessionfactory = null;
		Configuration config;
		try {
			config = new AnnotationConfiguration();
			config.configure();
			sessionfactory = config.buildSessionFactory();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return sessionfactory;
	}
}
