package com.lgq.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lgq.entity.TparsetagEntity;

@Repository
public class TparsetagDaoImpl implements TparsetagDAO {
	// Session factory injected by spring context
	private SessionFactory sessionFactory;

	@Override
	public void addURLTag(TparsetagEntity newtag) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(newtag);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TparsetagEntity> getAllTags() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession()
				.createQuery("from TparsetagEntity").list();
	}

	@Override
	public void deleteTag(Integer urlId) {
		// TODO Auto-generated method stub
		TparsetagEntity turltag = (TparsetagEntity) sessionFactory.getCurrentSession().load(
				TparsetagEntity.class, urlId);
		if (null != turltag) {
			this.sessionFactory.getCurrentSession().delete(turltag);
		}
	}

	// This setter will be used by Spring context to inject the sessionFactory
	// instance
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
