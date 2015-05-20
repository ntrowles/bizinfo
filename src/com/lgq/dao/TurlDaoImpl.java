package com.lgq.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lgq.entity.TurlEntity;

@Repository
public class TurlDaoImpl implements TurlDAO {
	// Session factory injected by spring context
	private SessionFactory sessionFactory;

	@Override
	public void addURL(TurlEntity newurl) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(newurl);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TurlEntity> getAllURLs() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession()
				.createQuery("from TurlEntity").list();
	}

	@Override
	public void deleteURL(Integer urlId) {
		// TODO Auto-generated method stub
		TurlEntity turl = (TurlEntity) sessionFactory.getCurrentSession().load(
				TurlEntity.class, urlId);
		if (null != turl) {
			this.sessionFactory.getCurrentSession().delete(turl);
		}
	}

	// This setter will be used by Spring context to inject the sessionFactory
	// instance
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public TurlEntity getURL(Integer urlId) {
		// TODO Auto-generated method stub
		TurlEntity turl = (TurlEntity) sessionFactory.getCurrentSession().load(
				TurlEntity.class, urlId);

		if (null != turl) {
			return turl;
		}
		return null;
	}

}
