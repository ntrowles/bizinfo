package com.lgq.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.lgq.dao.TvisitorDAO;
import com.lgq.entity.TvisitorEntity;

public class TvisitorManagerImpl implements TvisitorManager {
	// Visitor dao injected by Spring context
	private TvisitorDAO tvisitorDAO;

	// This setter will be used by Spring context to inject the dao's instance
	public void setTvisitorDAO(TvisitorDAO tvisitorDAO) {
		this.tvisitorDAO = tvisitorDAO;
	}

	@Override
	@Transactional
	public void addVisitor(TvisitorEntity visitor) {
		// TODO Auto-generated method stub
		tvisitorDAO.addVisitor(visitor);
	}

	@Override
	@Transactional
	public List<TvisitorEntity> getAllVisitors() {
		// TODO Auto-generated method stub
		return tvisitorDAO.getAllVisitors();
	}

	@Override
	@Transactional
	public void deleteVisitor(Integer visitorId) {
		// TODO Auto-generated method stub
		tvisitorDAO.deleteVisitor(visitorId);
	}

	@Override
	@Transactional
	public int findVisitor(String macaddress) {
		// TODO Auto-generated method stub
		return tvisitorDAO.findVisitor(macaddress);
	}

}
