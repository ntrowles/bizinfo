package com.lgq.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.lgq.entity.TbusinesstypeEntity;
import com.lgq.entity.TurlEntity;
import com.lgq.service.TbusinesstypeManager;
import com.lgq.service.TurlManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class EditURLAction extends ActionSupport implements Preparable {
	private static final long serialVersionUID = 1L;

	// Logger configured using log4j
	private static final Logger logger = Logger.getLogger(EditURLAction.class);
	private List<TurlEntity> turls;
	private List<TbusinesstypeEntity> tbusinesstypes;
	private TurlEntity turl;
	private TurlManager turlManager;
	private TbusinesstypeManager tbusinesstypeManager;

	private List<String> urlTypes = new ArrayList<String>();
	private String urlType;
	private String defaulturlType;

	public String getDefaulturlType() {
		return defaulturlType;
	}

	public String getUrlType() {
		return urlType;
	}

	public void setUrlType(String urlType) {
		this.urlType = urlType;
	}

	public List<String> getUrlTypes() {
		return urlTypes;
	}

	public void setUrlTypes(List<String> urlTypes) {
		this.urlTypes = urlTypes;
	}

	public TbusinesstypeManager getTbusinesstypeManager() {
		return tbusinesstypeManager;
	}

	public void setTbusinesstypeManager(
			TbusinesstypeManager tbusinesstypeManager) {
		this.tbusinesstypeManager = tbusinesstypeManager;
	}

	public List<TbusinesstypeEntity> getTbusinesstypes() {
		return tbusinesstypes;
	}

	public void setTbusinesstypes(List<TbusinesstypeEntity> tbusinesstypes) {
		this.tbusinesstypes = tbusinesstypes;
	}

	public String listURLs() {
		logger.info("listURLs method called");
		turls = turlManager.getAllURLs();
		tbusinesstypes = tbusinesstypeManager.getAllTypes();
		int index = 0;
		defaulturlType = tbusinesstypeManager.getAllTypes().get(0)
				.getTypename();
		while (index < tbusinesstypes.size()) {
			urlTypes.add(tbusinesstypes.get(index).getTypename());
			index++;
		}

		return SUCCESS;
	}

	public String addURL() {
		logger.info("addURL method called");
		turlManager.addURL(turl);
		return SUCCESS;
	}

	public String deleteURL() {
		logger.info("deleteURL method called");
		turlManager.deleteURL(turl.getId());
		return SUCCESS;
	}

	// This method will be called before any of Action method is invoked;
	// So some pre-processing if required.

	@Override
	public void prepare() throws Exception {
		turl = null;
	}

	public List<TurlEntity> getTurls() {
		return turls;
	}

	public void setTurls(List<TurlEntity> turls) {
		this.turls = turls;
	}

	public TurlEntity getTurl() {
		return turl;
	}

	public void setTurl(TurlEntity turl) {
		this.turl = turl;
	}

	public TurlManager getTurlManager() {
		return turlManager;
	}

	public void setTurlManager(TurlManager turlManager) {
		this.turlManager = turlManager;
	}

}
