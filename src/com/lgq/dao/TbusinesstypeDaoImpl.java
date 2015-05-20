package com.lgq.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lgq.entity.TbusinesstypeEntity;

@Repository
public class TbusinesstypeDaoImpl implements TbusinesstypeDAO {
	// Session factory injected by spring context
	private SessionFactory sessionFactory;

	@Override
	public void addType(TbusinesstypeEntity tbusinesstype) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(tbusinesstype);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TbusinesstypeEntity> getAllTypes() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession()
				.createQuery("from TbusinesstypeEntity").list();
	}

	@Override
	public void deleteType(Integer typeId) {
		// TODO Auto-generated method stub
		TbusinesstypeEntity tbusinesstype = (TbusinesstypeEntity) sessionFactory
				.getCurrentSession().load(TbusinesstypeEntity.class, typeId);
		if (null != tbusinesstype) {
			this.sessionFactory.getCurrentSession().delete(tbusinesstype);
		}
	}

	// This setter will be used by Spring context to inject the sessionFactory
	// instance
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public TbusinesstypeEntity getBusinessType(Integer bytpeId) {
		// TODO Auto-generated method stub
		TbusinesstypeEntity tbusinesstype = (TbusinesstypeEntity) sessionFactory
				.getCurrentSession().load(TbusinesstypeEntity.class, bytpeId);
		if (null != tbusinesstype) {
			return tbusinesstype;
		}
		return null;
	}

	@Override
	public void UpdateStatistics(Integer bytpeId) {
		// TODO Auto-generated method stub
		TbusinesstypeEntity tbusinesstype = (TbusinesstypeEntity) sessionFactory
				.getCurrentSession().load(TbusinesstypeEntity.class, bytpeId);
		if (null != tbusinesstype) {
			int stat = tbusinesstype.getStatistics() + 1;
			tbusinesstype.setStatistics(stat);
			this.sessionFactory.getCurrentSession().update(tbusinesstype);
		}

	}

}
