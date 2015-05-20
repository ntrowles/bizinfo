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

import com.lgq.dao.TbusinesstypeDAO;
import com.lgq.entity.TbusinesstypeEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class TbusinesstypeDaoImplTest {

	@Autowired
	private TbusinesstypeDAO tbusinesstypaDAO;
	
	@Test
	public void testGetAllTypes()
	{
		List<TbusinesstypeEntity> tbusinesstypes = tbusinesstypaDAO.getAllTypes();
		
		assertNotNull(tbusinesstypes);
	}
	
	@Test
	public void testGetBusinessTypeById()
	{
		TbusinesstypeEntity tbusinesstypeEntity = tbusinesstypaDAO.getBusinessType(3);
		
		assertEquals("Business Sale", tbusinesstypeEntity.getTypename());
	}
	
}
