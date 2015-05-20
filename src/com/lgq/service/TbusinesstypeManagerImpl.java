package com.lgq.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lgq.dao.TbusinesstypeDAO;
import com.lgq.entity.TbusinesstypeEntity;

public class TbusinesstypeManagerImpl implements TbusinesstypeManager {
	// business type dao injected by Spring context
	private TbusinesstypeDAO tbusinesstypeDAO;

	// This method will be called when a business type object is added
	@Override
	@Transactional
	public void addType(TbusinesstypeEntity btype) {
		tbusinesstypeDAO.addType(btype);
	}

	// This method return list of business types in database
	@Override
	@Transactional
	public List<TbusinesstypeEntity> getAllTypes() {
		return tbusinesstypeDAO.getAllTypes();
	}

	// Deletes a business type by it's id
	@Override
	@Transactional
	public void deleteType(Integer bytpeId) {
		tbusinesstypeDAO.deleteType(bytpeId);
	}

	// This setter will be used by Spring context to inject the dao's instance
	public void setTbusinesstypeDAO(TbusinesstypeDAO tbusinesstypeDAO) {
		this.tbusinesstypeDAO = tbusinesstypeDAO;
	}

	@Override
	@Transactional
	public TbusinesstypeEntity getBusinessType(Integer bytpeId) {
		// TODO Auto-generated method stub
		TbusinesstypeEntity tbusinesstype = (TbusinesstypeEntity) tbusinesstypeDAO
				.getBusinessType(bytpeId);
		if (null != tbusinesstype) {
			return tbusinesstype;
		}
		return null;
	}

	@Override
	@Transactional
	public void UpdateStatistics(Integer bytpeId) {
		// TODO Auto-generated method stub
		tbusinesstypeDAO.UpdateStatistics(bytpeId);
	}

}
