package com.lgq.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lgq.dao.TurlDAO;
import com.lgq.entity.TurlEntity;

public class TurlManagerImpl implements TurlManager {
	//Employee dao injected by Spring context
    private TurlDAO turlDAO;
	
	//This method will be called when a employee object is added
	@Override
	@Transactional
	public void addURL(TurlEntity newurl) {
		turlDAO.addURL(newurl);
	}
	
	//This method return list of employees in database
	@Override
	@Transactional
	public List<TurlEntity> getAllURLs() {
		return turlDAO.getAllURLs();
	}
	//Deletes a employee by it's id
	@Override
	@Transactional
	public void deleteURL(Integer urlId) {
		turlDAO.deleteURL(urlId);
	}

	//This setter will be used by Spring context to inject the dao's instance
	public void setTurlDAO(TurlDAO turlDAO) {
		this.turlDAO = turlDAO;
	}

	@Override
	@Transactional
	public TurlEntity getURL(Integer urlId) {
		// TODO Auto-generated method stub
		return turlDAO.getURL(urlId);
	}
}
