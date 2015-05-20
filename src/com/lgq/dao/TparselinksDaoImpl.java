package com.lgq.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lgq.entity.TparselinksEntity;

@Repository
public class TparselinksDaoImpl implements TparselinksDAO {
	// Session factory injected by spring context
	private SessionFactory sessionFactory;

	@Override
	public void addlink(TparselinksEntity newlink) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(newlink);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TparselinksEntity> getAllLinks() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession()
				.createQuery("from TparselinksEntity order by id DESC").list();
	}

	@Override
	public void deletelink(Integer linkId) {
		// TODO Auto-generated method stub
		TparselinksEntity tparselink = (TparselinksEntity) sessionFactory
				.getCurrentSession().load(TparselinksEntity.class, linkId);
		if (null != tparselink) {
			this.sessionFactory.getCurrentSession().delete(tparselink);
		}
	}

	// This setter will be used by Spring context to inject the sessionFactory
	// instance
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public TparselinksEntity getlink(Integer linkId) {
		// TODO Auto-generated method stub
		TparselinksEntity tparselink = (TparselinksEntity) sessionFactory
				.getCurrentSession().load(TparselinksEntity.class, linkId);

		if (null != tparselink) {
			return tparselink;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TparselinksEntity> getpartLinks(Integer startpage,
			Integer listSize, Integer businesstypeid) {
		// TODO Auto-generated method stub

		List<TparselinksEntity> alllink = this.sessionFactory
				.getCurrentSession()
				.createQuery("from TparselinksEntity order by id DESC").list();

		List<TparselinksEntity> partlink = new ArrayList<TparselinksEntity>();
		int index = 0;
		int count = 0;
		while (index < alllink.size()) {
			if (alllink.get(index).getTypeid() == businesstypeid) {
				if (count >= (startpage - 1) * listSize
						&& count < startpage * listSize) {
					TparselinksEntity tp = alllink.get(index);
					partlink.add(tp);
				}
				count++;
			}
			index++;
		}

		return partlink;
	}

	@Override
	public void updateStatistics(Integer linkId) {
		// TODO Auto-generated method stub
		TparselinksEntity tparselink = (TparselinksEntity) sessionFactory
				.getCurrentSession().load(TparselinksEntity.class, linkId);

		if (null != tparselink) {
			tparselink.setStatistics(tparselink.getStatistics() + 1);
			this.sessionFactory.getCurrentSession().update(tparselink);
		}
	}

	@Override
	public void updateLink(TparselinksEntity ntparselink) {
		// TODO Auto-generated method stub
		
		int linkId = ntparselink.getId();
		TparselinksEntity tparselink = (TparselinksEntity) sessionFactory
				.getCurrentSession().load(TparselinksEntity.class, linkId);

		if (null != tparselink) {
			tparselink.setTypeid(ntparselink.getTypeid());
			tparselink.setOutlinktitle(ntparselink.getOutlinktitle());
			tparselink.setOutlinkurl(ntparselink.getOutlinkurl());
			this.sessionFactory.getCurrentSession().update(tparselink);
		}
	}
}
