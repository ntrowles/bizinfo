package com.lgq.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lgq.dao.TvisitstatisticsDAO;
import com.lgq.entity.TvisitstatisticsEntity;

public class TvisitstatisticsManagerImpl implements TvisitstatisticsManager {
    private TvisitstatisticsDAO tvisitstatisticsDAO;
	
	@Override
	@Transactional
	public void addStatistics(TvisitstatisticsEntity statistics){
    	tvisitstatisticsDAO.addStatistics(statistics);
	}

	@Override
	@Transactional
	public List<TvisitstatisticsEntity> getAllStatistics(){
		return tvisitstatisticsDAO.getAllStatistics();
	}
	
	@Override
	@Transactional
	public void deleteStatistics(Integer statisticsId){
		tvisitstatisticsDAO.deleteStatistics(statisticsId);
	}

	
	//This setter will be used by Spring context to inject the dao's instance
	public void setTvisitstatisticsDAO(TvisitstatisticsDAO tvisitstatisticsDAO) {
		this.tvisitstatisticsDAO = tvisitstatisticsDAO;
	}

	@Override
	@Transactional
	public void updateStatistics(Integer statisticsId) {
		// TODO Auto-generated method stub
		tvisitstatisticsDAO.updateStatistics(statisticsId);
	}

	@Override
	@Transactional
	public void updateStatus(Integer statisticsId) {
		// TODO Auto-generated method stub
		tvisitstatisticsDAO.updateStatus(statisticsId);
	}
	
}
