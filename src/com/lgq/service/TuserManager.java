package com.lgq.service;

import java.util.List;

import com.lgq.entity.TuserEntity;

public interface TuserManager {
	//This method will be called when a employee object is added
    public int addUser(TuserEntity user);
    //This method return list of employees in database
    public List<TuserEntity> getAllUsers();
    //Deletes a employee by it's id
    public int deleteUser(Integer userId);
    //Deletes a employee by it's id
    public boolean findUser(String username, String password);
}
