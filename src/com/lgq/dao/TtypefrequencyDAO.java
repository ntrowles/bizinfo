package com.lgq.dao;

import java.util.List;

import com.lgq.entity.TtypefrequencyEntity;

public interface TtypefrequencyDAO 
{
	//This method will be called when a tbusinesstype object is added
    public void addTypeFrequency(TtypefrequencyEntity btype);
    //This method return list of tbusinesstype in database
    public List<TtypefrequencyEntity> getAllTypesFrequency();
    //Deletes a tbusinesstype by it's id
    public void deleteTypeFrequency(Integer bytpeId);
    //Find a tbusinesstype by it's id
    public TtypefrequencyEntity getTypeFrequency(Integer bytpeId);
    
    public void UpdateTypeFrequency(Integer bytpeId);
    
    public void UpdateStatus(Integer bytpeId);
}