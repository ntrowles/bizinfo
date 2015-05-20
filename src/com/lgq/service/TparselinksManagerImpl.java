package com.lgq.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lgq.dao.TparselinksDAO;
import com.lgq.entity.TparselinksEntity;

public class TparselinksManagerImpl implements TparselinksManager {
	//Employee dao injected by Spring context
    private TparselinksDAO tparselinksDAO;
	
	//This method will be called when a employee object is added
	@Override
	@Transactional
	public void addlink(TparselinksEntity newlink) {
		tparselinksDAO.addlink(newlink);
	}
	
	//This method return list of employees in database
	@Override
	@Transactional
	public List<TparselinksEntity> getAllLinks() {
		return tparselinksDAO.getAllLinks();
	}
	//Deletes a employee by it's id
	@Override
	@Transactional
	public void deletelink(Integer linkId) {
		tparselinksDAO.deletelink(linkId);
	}

	@Override
	@Transactional
	public TparselinksEntity getlink(Integer linkId) {
		// TODO Auto-generated method stub
		return tparselinksDAO.getlink(linkId);
	}
	//This setter will be used by Spring context to inject the dao's instance
	public void setTparselinksDAO(TparselinksDAO tparselinksDAO) {
		this.tparselinksDAO = tparselinksDAO;
	}

	@Override
	@Transactional
	public List<TparselinksEntity> getpartLinks(Integer startpage,
			Integer listSize, Integer businesstypeid) {
		// TODO Auto-generated method stub
		return tparselinksDAO.getpartLinks(startpage, listSize, businesstypeid);
	}

	@Override
	@Transactional
	public void updateStatistics(Integer linkId) {
		// TODO Auto-generated method stub
		tparselinksDAO.updateStatistics(linkId);
	}

	@Override
	@Transactional
	public void updateLink(TparselinksEntity ntparselink) {
		// TODO Auto-generated method stub
		tparselinksDAO.updateLink(ntparselink);
	}
}
