package com.lgq.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lgq.dao.TuserDAO;
import com.lgq.entity.TuserEntity;

public class TuserManagerImpl implements TuserManager {
	//Employee dao injected by Spring context
    private TuserDAO tuserDAO;
	
	//This method will be called when a employee object is added
	@Override
	@Transactional
	public int addUser(TuserEntity user) {
		tuserDAO.addUser(user);
		return user.getId();
	}
	
	//This method return list of employees in database
	@Override
	@Transactional
	public List<TuserEntity> getAllUsers() {
		return tuserDAO.getAllUsers();
	}
	//Deletes a employee by it's id
	@Override
	@Transactional
	public int deleteUser(Integer userId) {
		if(tuserDAO.deleteUser(userId)>0)
			return userId;
		else
			return -1;
	}

	//This setter will be used by Spring context to inject the dao's instance
	public void setTuserDAO(TuserDAO tuserDAO) {
		this.tuserDAO = tuserDAO;
	}

	@Override
	@Transactional
	public boolean findUser(String username, String password) {
		// TODO Auto-generated method stub
		
		List<TuserEntity> alluser = getAllUsers();
		for (int index = 0; index < alluser.size(); index++) {
			if (username.equals(alluser.get(index).getUsername())
					&& password.equals(alluser.get(index).getPassword())) {
				return true;
			}
		}

		return false;
	}
	
}
