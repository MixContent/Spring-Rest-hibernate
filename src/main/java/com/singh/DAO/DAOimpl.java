package com.singh.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.singh.model.Emp;

@Repository
public class DAOimpl implements DAO {
	@Autowired
	private SessionFactory sessionfactory;
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Override
	public int saveEmployee(Emp employee) {
		// TODO Auto-generated method stub
		Session session = this.sessionfactory.openSession();
		Transaction tx =session.beginTransaction();
		session.save(employee);
		tx.commit();
		session.close();
		
		return 0;
	}

}
