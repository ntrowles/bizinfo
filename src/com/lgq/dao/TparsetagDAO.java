package com.lgq.dao;

import java.util.List;

import com.lgq.entity.TparsetagEntity;

public interface TparsetagDAO 
{
	//This method will be called when a URL object is added
    public void addURLTag(TparsetagEntity newtag);
    //This method return list of URLs in database
    public List<TparsetagEntity> getAllTags();
    //Deletes a URL by it's id
    public void deleteTag(Integer urlId);
}