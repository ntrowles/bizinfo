package com.lgq.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.lgq.entity.TbusinesstypeEntity;
import com.lgq.entity.TparsetagEntity;
import com.lgq.entity.TurlEntity;
import com.lgq.service.TbusinesstypeManager;
import com.lgq.service.TparsetagManager;
import com.lgq.service.TurlManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class EditParseTagAction extends ActionSupport implements Preparable {
	private static final long serialVersionUID = 1L;

	// Logger configured using log4j
	private static final Logger logger = Logger
			.getLogger(EditParseTagAction.class);
	private List<TurlEntity> turls;
	private List<TbusinesstypeEntity> tbusinesstypes;
	private List<TparsetagEntity> tparsetags;
	private TurlEntity turl;
	private TparsetagEntity tparsetag;
	private TurlManager turlManager;
	private TbusinesstypeManager tbusinesstypeManager;
	private TparsetagManager tparsetagManager;

	/*
	 * Parsetag Entity Setter & Getter
	 */
	public List<TparsetagEntity> getTparsetags() {
		return tparsetags;
	}

	public void setTparsetags(List<TparsetagEntity> tparsetags) {
		this.tparsetags = tparsetags;
	}

	public TparsetagEntity getTparsetag() {
		return tparsetag;
	}

	public void setTparsetag(TparsetagEntity tparsetag) {
		this.tparsetag = tparsetag;
	}

	public TparsetagManager getTparsetagManager() {
		return tparsetagManager;
	}

	public void setTparsetagManager(TparsetagManager tparsetagManager) {
		this.tparsetagManager = tparsetagManager;
	}

	/*
	 * Receive URL types
	 */
	private List<String> urlTypes = new ArrayList<String>();
	private String urlType;
	private String defaulturlType;

	// receive uid
	private int parseurlid;

	public int getParseurlid() {
		return parseurlid;
	}

	public void setParseurlid(int parseurlid) {
		this.parseurlid = parseurlid;
	}

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

	public String listParseTags() {
		logger.info("listURLTags method called");
		tparsetags = tparsetagManager.getAllTags();
		turls = turlManager.getAllURLs();
		tbusinesstypes = tbusinesstypeManager.getAllTypes();
		if (turl != null)
			parseurlid = turl.getId();
		
		return SUCCESS;
	}

	public String addURLTag() {
		logger.info("addURLTag method called");
		tparsetags = tparsetagManager.getAllTags();
		parseurlid = tparsetag.getUrlid();
		
		for (int tagIndex = 0; tagIndex < tparsetags.size(); tagIndex++) {
			if ((tparsetags.get(tagIndex).getUrlid() == tparsetag.getUrlid())
					&& (tparsetags.get(tagIndex).getContent().equals(tparsetag
							.getContent()))) {
				return SUCCESS;
			}
		}

		tparsetagManager.addURLTag(tparsetag);
		return SUCCESS;
	}

	public String deleteURLTag() {
		logger.info("deleteURLTag method called");
		tparsetagManager.deleteTag(tparsetag.getId());
		return SUCCESS;
	}

	// This method will be called before any of Action method is invoked;
	// So some pre-processing if required.

	@Override
	public void prepare() throws Exception {
		tparsetag = null;
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

	// For URL
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
		turls = turlManager.getAllURLs();
		for(int index=0;index<turls.size();index++){
			if(turl.getUrllink().equals(turls.get(index).getUrllink()))
				return INPUT;
		}
		turlManager.addURL(turl);
		return SUCCESS;
	}

	public String deleteURL() {
		logger.info("deleteURL method called");
		turlManager.deleteURL(turl.getId());
		return SUCCESS;
	}
}
