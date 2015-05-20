package com.lgq.dao;

import java.util.List;

import com.lgq.entity.TvisitstatisticsEntity;

public interface TvisitstatisticsDAO 
{

    public void addStatistics(TvisitstatisticsEntity statistics);

    public List<TvisitstatisticsEntity> getAllStatistics();

    public void deleteStatistics(Integer statisticsId);
    
    public void updateStatistics(Integer statisticsId);
    
    public void updateStatus(Integer statisticsId);
}