package com.lgq.service;

import java.util.List;

import com.lgq.entity.TparsetagEntity;

public interface TparsetagManager {
	//This method will be called when a employee object is added
    public void addURLTag(TparsetagEntity newtag);
    //This method return list of employees in database
    public List<TparsetagEntity> getAllTags();
    //Deletes a employee by it's id
    public void deleteTag(Integer urlId);
   
}
