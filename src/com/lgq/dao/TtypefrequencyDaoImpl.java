package com.lgq.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lgq.entity.TtypefrequencyEntity;

@Repository
public class TtypefrequencyDaoImpl implements TtypefrequencyDAO {
	// Session factory injected by spring context
	private SessionFactory sessionFactory;

	@Override
	public void addTypeFrequency(TtypefrequencyEntity btype) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(btype);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TtypefrequencyEntity> getAllTypesFrequency() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession()
				.createQuery("from TtypefrequencyEntity").list();
	}

	@Override
	public void deleteTypeFrequency(Integer fid) {
		// TODO Auto-generated method stub
		TtypefrequencyEntity ttypefrequency = (TtypefrequencyEntity) sessionFactory
				.getCurrentSession().load(TtypefrequencyEntity.class, fid);
		if (null != ttypefrequency) {
			this.sessionFactory.getCurrentSession().delete(ttypefrequency);
		}
	}

	@Override
	public TtypefrequencyEntity getTypeFrequency(Integer fid) {
		// TODO Auto-generated method stub
		TtypefrequencyEntity ttypefrequency = (TtypefrequencyEntity) sessionFactory
				.getCurrentSession().load(TtypefrequencyEntity.class, fid);
		if (null != ttypefrequency) {
			return ttypefrequency;
		}
		return null;
	}

	@Override
	public void UpdateTypeFrequency(Integer fid) {
		// TODO Auto-generated method stub
		TtypefrequencyEntity ttypefrequency = (TtypefrequencyEntity) sessionFactory
				.getCurrentSession().load(TtypefrequencyEntity.class, fid);
		if (null != ttypefrequency) {
			ttypefrequency.setVisittimes(ttypefrequency.getVisittimes() + 1);
			this.sessionFactory.getCurrentSession().update(ttypefrequency);
		}
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void UpdateStatus(Integer bytpeId) {
		// TODO Auto-generated method stub
		TtypefrequencyEntity ttypefrequency = (TtypefrequencyEntity) sessionFactory
				.getCurrentSession().load(TtypefrequencyEntity.class, bytpeId);
		if (null != ttypefrequency) {
			ttypefrequency.setStatus(0);
			this.sessionFactory.getCurrentSession().update(ttypefrequency);
		}
	}
	
	
}
