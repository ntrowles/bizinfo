package com.lgq.dao;

import java.util.List;

import com.lgq.entity.TparselinksEntity;

public interface TparselinksDAO 
{
	//This method will be called when a link object is added
    public void addlink(TparselinksEntity newlink);
    //This method return list of links in database
    public List<TparselinksEntity> getAllLinks();
    //Deletes a link by it's id
    public void deletelink(Integer linkId);
    
    public TparselinksEntity getlink(Integer linkId);
    
    public List<TparselinksEntity> getpartLinks(Integer startpage, Integer listSize, Integer businesstypeid);
    
    public void updateStatistics(Integer linkId);
    
    public void updateLink(TparselinksEntity ntparselink);
}