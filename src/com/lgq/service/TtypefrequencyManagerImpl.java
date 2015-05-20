package com.lgq.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lgq.dao.TtypefrequencyDAO;
import com.lgq.entity.TtypefrequencyEntity;

public class TtypefrequencyManagerImpl implements TtypefrequencyManager {
	// business type dao injected by Spring context
	private TtypefrequencyDAO ttypefrequencyDAO;

	@Override
	@Transactional
	public void addTypeFrequency(TtypefrequencyEntity btype) {
		// TODO Auto-generated method stub
		ttypefrequencyDAO.addTypeFrequency(btype);
	}

	@Override
	@Transactional
	public List<TtypefrequencyEntity> getAllTypesFrequency() {
		// TODO Auto-generated method stub
		return ttypefrequencyDAO.getAllTypesFrequency();
	}

	@Override
	@Transactional
	public void deleteTypeFrequency(Integer bytpeId) {
		// TODO Auto-generated method stub
		ttypefrequencyDAO.deleteTypeFrequency(bytpeId);
		
	}

	@Override
	@Transactional
	public TtypefrequencyEntity getTypeFrequency(Integer bytpeId) {
		// TODO Auto-generated method stub
		return ttypefrequencyDAO.getTypeFrequency(bytpeId);
	}

	@Override
	@Transactional
	public void UpdateTypeFrequency(Integer bytpeId) {
		// TODO Auto-generated method stub
		ttypefrequencyDAO.UpdateTypeFrequency(bytpeId);
	}

	public void setTtypefrequencyDAO(TtypefrequencyDAO ttypefrequencyDAO) {
		this.ttypefrequencyDAO = ttypefrequencyDAO;
	}

	@Override
	@Transactional
	public void UpdateStatus(Integer bytpeId) {
		// TODO Auto-generated method stub
		ttypefrequencyDAO.UpdateStatus(bytpeId);
	}

	
}
