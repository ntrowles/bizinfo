package com.lgq.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lgq.entity.TuserEntity;

@Repository
public class TuserDaoImpl implements TuserDAO {
	// Session factory injected by spring context
	private SessionFactory sessionFactory;

	// This method will be called when a employee object is added
	@Override
	public int addUser(TuserEntity user) {
		this.sessionFactory.getCurrentSession().save(user);
		return user.getId();
	}

	// This method return list of employees in database
	@SuppressWarnings("unchecked")
	@Override
	public List<TuserEntity> getAllUsers() {
		return this.sessionFactory.getCurrentSession()
				.createQuery("from TuserEntity").list();
	}

	// Deletes a employee by it's id
	@Override
	public int deleteUser(Integer userId) {
		TuserEntity user = (TuserEntity) sessionFactory.getCurrentSession()
				.load(TuserEntity.class, userId);
		if (null != userId) {
			this.sessionFactory.getCurrentSession().delete(user);
			return userId;
		} else
			return -1;
	}

	// This setter will be used by Spring context to inject the sessionFactory
	// instance
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
