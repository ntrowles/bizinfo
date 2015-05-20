package com.lgq.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lgq.entity.TvisitstatisticsEntity;

@Repository
public class TvisitstatisticsDaoImpl implements TvisitstatisticsDAO {
	// Session factory injected by spring context
	private SessionFactory sessionFactory;

	// This method will be called when a employee object is added
	@Override
	public void addStatistics(TvisitstatisticsEntity statistics) {
		this.sessionFactory.getCurrentSession().save(statistics);
	}

	// This method return list of employees in database
	@SuppressWarnings("unchecked")
	@Override
	public List<TvisitstatisticsEntity> getAllStatistics() {
		return this.sessionFactory.getCurrentSession()
				.createQuery("from TvisitstatisticsEntity").list();
	}

	// Deletes a employee by it's id
	@Override
	public void deleteStatistics(Integer statisticsId) {
		TvisitstatisticsEntity statistics = (TvisitstatisticsEntity) sessionFactory
				.getCurrentSession().load(TvisitstatisticsEntity.class,
						statisticsId);
		if (null != statistics) {
			this.sessionFactory.getCurrentSession().delete(statistics);
		}
	}

	// This setter will be used by Spring context to inject the sessionFactory
	// instance
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void updateStatistics(Integer statisticsId) {
		// TODO Auto-generated method stub
		TvisitstatisticsEntity statistics = (TvisitstatisticsEntity) sessionFactory
				.getCurrentSession().load(TvisitstatisticsEntity.class,
						statisticsId);
		if (null != statistics) {
			statistics.setVisittimes(statistics.getVisittimes()+1);
			this.sessionFactory.getCurrentSession().update(statistics);
		}
	}

	@Override
	public void updateStatus(Integer statisticsId) {
		// TODO Auto-generated method stub
		TvisitstatisticsEntity statistics = (TvisitstatisticsEntity) sessionFactory
				.getCurrentSession().load(TvisitstatisticsEntity.class,
						statisticsId);
		if (null != statistics) {
			statistics.setStatus(0);
			this.sessionFactory.getCurrentSession().update(statistics);
		}
	}
}
