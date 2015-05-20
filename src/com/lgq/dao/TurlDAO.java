package com.lgq.dao;

import java.util.List;

import com.lgq.entity.TurlEntity;

public interface TurlDAO 
{
	//This method will be called when a URL object is added
    public void addURL(TurlEntity newurl);
    //This method return list of URLs in database
    public List<TurlEntity> getAllURLs();
    //Deletes a URL by it's id
    public void deleteURL(Integer urlId);
    
    public TurlEntity getURL(Integer urlId);
}