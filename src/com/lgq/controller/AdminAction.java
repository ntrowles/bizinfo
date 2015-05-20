package com.lgq.controller;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class AdminAction extends ActionSupport implements Preparable {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(AdminAction.class);

	@Override
	public void prepare() throws Exception {
		
	}

	public String listAdmin() {
		logger.info("listAdmin method called");
		return SUCCESS;
	}

}
