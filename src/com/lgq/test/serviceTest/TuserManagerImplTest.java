package com.lgq.test.serviceTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.lgq.entity.TuserEntity;
import com.lgq.service.TuserManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class TuserManagerImplTest {

	@Autowired
	private TuserManager tuserManager;

	@Test
	public void testGetAllUsers() {
		List<TuserEntity> users = tuserManager.getAllUsers();

		assertNotNull(users);
	}

	@Test
	public void testFindUser() {
		boolean isUser = tuserManager.findUser("gongqi", "123456");
		
		assertEquals(true, isUser);
	}

}
