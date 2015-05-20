package com.lgq.dao;

import java.util.List;

import com.lgq.entity.TvisitorEntity;

public interface TvisitorDAO 
{
	//This method will be called when a visitor object is added
    public void addVisitor(TvisitorEntity visitor);
    //This method return list of visitors in database
    public List<TvisitorEntity> getAllVisitors();
    //Deletes a visitor by it's id
    public void deleteVisitor(Integer visitorId);

    public int findVisitor(String macaddress);
}