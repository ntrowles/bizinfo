package com.lgq.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lgq.entity.TvisitorEntity;

@Repository
public class TvisitorDaoImpl implements TvisitorDAO {
	// Session factory injected by spring context
	private SessionFactory sessionFactory;

	@Override
	public void addVisitor(TvisitorEntity visitor) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(visitor);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TvisitorEntity> getAllVisitors() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession()
				.createQuery("from TvisitorEntity").list();
	}

	@Override
	public void deleteVisitor(Integer visitorId) {
		// TODO Auto-generated method stub
		TvisitorEntity visitor = (TvisitorEntity) sessionFactory
				.getCurrentSession().load(TvisitorEntity.class, visitorId);
		if (null != visitorId) {
			this.sessionFactory.getCurrentSession().delete(visitor);
		}
	}

	// This setter will be used by Spring context to inject the sessionFactory
	// instance
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public int findVisitor(String macaddress) {
		// TODO Auto-generated method stub
		List<TvisitorEntity> allvisitor = getAllVisitors();
		for (int index = 0; index < allvisitor.size(); index++) {
			if (macaddress.equals(allvisitor.get(index).getMacaddress())) {
				return allvisitor.get(index).getId();
			}
		}

		return 0;
	}
}
