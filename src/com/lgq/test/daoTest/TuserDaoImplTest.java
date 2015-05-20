package com.lgq.test.daoTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.lgq.dao.TuserDAO;
import com.lgq.entity.TuserEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class TuserDaoImplTest {

	@Autowired
	private TuserDAO tuserDAO;

	@Test
	public void testGetAllUser() {
		List<TuserEntity> user = tuserDAO.getAllUsers();

		assertNotNull(user);
	}

	@Test
	public void testFindUser() {
		TuserEntity user = new TuserEntity();
		user.setUsername("joseph");
		user.setPassword("123456");
		int keyId = tuserDAO.addUser(user);

		//due to auto increment for the userid, the equal number should be changed after roolback
		assertEquals(true, keyId); 
	}

}