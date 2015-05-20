package com.lgq.service;

import java.util.List;

import com.lgq.entity.TparselinksEntity;

public interface TparselinksManager {
	//This method will be called when a employee object is added
    public void addlink(TparselinksEntity newlink);
    //This method return list of employees in database
    public List<TparselinksEntity> getAllLinks();
    //Deletes a employee by it's id
    public void deletelink(Integer linkId);
    
    public TparselinksEntity getlink(Integer linkId);
    
    public List<TparselinksEntity> getpartLinks(Integer startpage, Integer listSize, Integer businesstypeid);
    
    public void updateStatistics(Integer linkId);
    
    public void updateLink(TparselinksEntity ntparselink);
}
