package com.lgq.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import com.lgq.dao.TparsetagDAO;
import com.lgq.entity.TparsetagEntity;

public class TparsetagManagerImpl implements TparsetagManager {
	// Employee dao injected by Spring context
	private TparsetagDAO tparsetagDAO;

	@Override
	@Transactional
	public void addURLTag(TparsetagEntity newtag) {
		// TODO Auto-generated method stub
		tparsetagDAO.addURLTag(newtag);
	}

	@Override
	@Transactional
	public List<TparsetagEntity> getAllTags() {
		// TODO Auto-generated method stub
		return tparsetagDAO.getAllTags();
	}

	@Override
	@Transactional
	public void deleteTag(Integer urlId) {
		// TODO Auto-generated method stub
		tparsetagDAO.deleteTag(urlId);
	}

	// This setter will be used by Spring context to inject the dao's instance
	public void setTparsetagDAO(TparsetagDAO tparsetagDAO) {
		this.tparsetagDAO = tparsetagDAO;
	}
}
