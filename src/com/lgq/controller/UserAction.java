package com.lgq.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.lgq.entity.TuserEntity;
import com.lgq.service.TuserManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class UserAction extends ActionSupport implements Preparable,
		SessionAware {
	private static final long serialVersionUID = 1L;

	// Logger configured using log4j
	private static final Logger logger = Logger.getLogger(UserAction.class);
	private List<TuserEntity> tusers;
	private TuserEntity tuser;
	private TuserManager tuserManager;
	private Map<String, Object> sessionMap;

	public String listUsers() {
		logger.info("listusers method called");
		tusers = tuserManager.getAllUsers();
		return SUCCESS;
	}

	public String addUser() {
		logger.info("addUser method called");
		tuserManager.addUser(tuser);
		return SUCCESS;
	}

	String username;
	String password;

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String findUser() {
		logger.info("findUser method called");
		username = tuser.getUsername();
		password = tuser.getPassword();

		if (tuserManager.findUser(username, password) == true) {

			return SUCCESS;
		}
		return "NotFound";
	}

	public String deleteUser() {
		logger.info("deleteUser method called");
		tuserManager.deleteUser(tuser.getId());
		return SUCCESS;
	}

	// This method will be called before any of Action method is invoked;
	// So some pre-processing if required.
	@Override
	public void prepare() throws Exception {
		tuser = null;
	}

	public List<TuserEntity> getTusers() {
		return tusers;
	}

	public void setTusers(List<TuserEntity> tusers) {
		this.tusers = tusers;
	}

	public TuserEntity getTuser() {
		return tuser;
	}

	public void setTuser(TuserEntity tuser) {
		this.tuser = tuser;
	}

	public TuserManager getTuserManager() {
		return tuserManager;
	}

	public void setTuserManager(TuserManager tuserManager) {
		this.tuserManager = tuserManager;
	}

	public String login() {
		String loggedUserName = null;
		username = tuser.getUsername();
		password = tuser.getPassword();
		// check if the userName is already stored in the session
		if (sessionMap.containsKey("userName")) {
			loggedUserName = (String) sessionMap.get("userName");
		}
		if (loggedUserName != null && loggedUserName.equals(username)) {
			return SUCCESS; // return welcome page
		}

		// if no userName stored in the session,
		// check the entered userName and password

		if (tuserManager.findUser(username, password) == true) {

			// add userName to the session
			sessionMap.put("userName", username);

			return SUCCESS; // return welcome page
		}

		// in other cases, return login page
		return INPUT;
	}

	public String logout() {
		// remove userName from the session
		if (sessionMap.containsKey("userName")) {
			sessionMap.remove("userName");
		}
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

}
