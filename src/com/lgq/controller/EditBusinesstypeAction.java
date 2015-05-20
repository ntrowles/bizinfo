package com.lgq.controller;

import java.util.List;
import org.apache.log4j.Logger;
import com.lgq.entity.TbusinesstypeEntity;
import com.lgq.service.TbusinesstypeManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class EditBusinesstypeAction extends ActionSupport implements Preparable {
	private static final long serialVersionUID = 1L;

	// Logger configured using log4j
	private static final Logger logger = Logger
			.getLogger(EditBusinesstypeAction.class);
	private List<TbusinesstypeEntity> tbusinesstypes;
	private TbusinesstypeEntity tbusinesstype;
	private TbusinesstypeManager tbusinesstypeManager;

	public String listBusinesstypes() {
		logger.info("listBusinesstypes method called");
		tbusinesstypes = tbusinesstypeManager.getAllTypes();
		return SUCCESS;
	}

	public String addBusinesstype() {
		logger.info("addBusinesstype method called");
		tbusinesstypeManager.addType(tbusinesstype);
		return SUCCESS;
	}

	public String deleteBusinesstype() {
		logger.info("deleteBusinesstype method called");
		tbusinesstypeManager.deleteType(tbusinesstype.getId());
		return SUCCESS;
	}
	
	//statistics for visiting times
	public String updateBusinesstype() {
		logger.info("deleteBusinesstype method called");
		tbusinesstypeManager.UpdateStatistics(tbusinesstype.getId());
		return SUCCESS;
	}

	public String getBusinesstype() {
		logger.info("getBusinesstype method called");
		tbusinesstypeManager.getBusinessType(tbusinesstype.getId());
		return SUCCESS;
	}

	// This method will be called before any of Action method is invoked;
	// So some pre-processing if required.
	@Override
	public void prepare() throws Exception {
		tbusinesstype = null;
	}

	public List<TbusinesstypeEntity> getTbusinesstypes() {
		return tbusinesstypes;
	}

	public void setTbusinesstypes(List<TbusinesstypeEntity> tbusinesstypes) {
		this.tbusinesstypes = tbusinesstypes;
	}

	public TbusinesstypeEntity getTbusinesstype() {
		return tbusinesstype;
	}

	public void setTbusinesstype(TbusinesstypeEntity tbusinesstype) {
		this.tbusinesstype = tbusinesstype;
	}

	public TbusinesstypeManager getTbusinesstypeManager() {
		return tbusinesstypeManager;
	}

	public void setTbusinesstypeManager(
			TbusinesstypeManager tbusinesstypeManager) {
		this.tbusinesstypeManager = tbusinesstypeManager;
	}

}
