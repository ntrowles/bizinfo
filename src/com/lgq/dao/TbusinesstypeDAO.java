package com.lgq.dao;

import java.util.List;
import com.lgq.entity.TbusinesstypeEntity;

public interface TbusinesstypeDAO 
{
	//This method will be called when a tbusinesstype object is added
    public void addType(TbusinesstypeEntity btype);
    //This method return list of tbusinesstype in database
    public List<TbusinesstypeEntity> getAllTypes();
    //Deletes a tbusinesstype by it's id
    public void deleteType(Integer bytpeId);
    //Find a tbusinesstype by it's id
    public TbusinesstypeEntity getBusinessType(Integer bytpeId);
    
    public void UpdateStatistics(Integer bytpeId);
}