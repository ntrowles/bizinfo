package com.lgq.dao;

import java.util.List;

import com.lgq.entity.TuserEntity;

public interface TuserDAO 
{
    public int addUser(TuserEntity user);
    public List<TuserEntity> getAllUsers();
    public int deleteUser(Integer userId);
  
}