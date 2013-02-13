package org.madbit.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.madbit.hibernate.entity.Person;
import org.springframework.transaction.annotation.Transactional;
import au.com.project.sample.domain.Person;

public class MyDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional(readOnly=false)
	public void addPerson(Person p) {
		Session session = sessionFactory.openSession();
		session.save(p);
		session.close();
	}
}
