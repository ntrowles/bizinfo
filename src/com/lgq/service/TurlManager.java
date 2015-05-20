package com.lgq.service;

import java.util.List;
import com.lgq.entity.TurlEntity;

public interface TurlManager {
	//This method will be called when a employee object is added
    public void addURL(TurlEntity newurl);
    //This method return list of employees in database
    public List<TurlEntity> getAllURLs();
    //Deletes a employee by it's id
    public void deleteURL(Integer urlId);
  //Deletes a employee by it's id
    public TurlEntity getURL(Integer urlId);
}
