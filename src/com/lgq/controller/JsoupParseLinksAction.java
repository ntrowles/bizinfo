package com.lgq.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.lgq.entity.TbusinesstypeEntity;
import com.lgq.entity.TparselinksEntity;
import com.lgq.entity.TparsetagEntity;
import com.lgq.entity.TurlEntity;
import com.lgq.parse.ParseURL;
import com.lgq.service.TbusinesstypeManager;
import com.lgq.service.TparselinksManager;
import com.lgq.service.TparsetagManager;
import com.lgq.service.TurlManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class JsoupParseLinksAction extends ActionSupport implements Preparable {
	private static final long serialVersionUID = 1L;

	// Logger configured using log4j
	private static final Logger logger = Logger
			.getLogger(JsoupParseLinksAction.class);
	// List of entities; Setter and Getter are below
	private List<TurlEntity> turls;
	private List<TbusinesstypeEntity> tbusinesstypes;
	private List<TparsetagEntity> tparsetags;
	private List<TparselinksEntity> tparselinks;
	// an entity
	private TurlEntity turl;
	private TbusinesstypeEntity tbusinesstype;
	private TparsetagEntity tparsetag;
	private TparselinksEntity tparselink;

	// manager injected by spring context;
	private TurlManager turlManager;
	private TbusinesstypeManager tbusinesstypeManager;
	private TparsetagManager tparsetagManager;
	private TparselinksManager tparselinksManager;

	/*
	 * ParseLinks setter and getter
	 */

	public List<TparselinksEntity> getTparselinks() {
		return tparselinks;
	}

	public void setTparselinks(List<TparselinksEntity> tparselinks) {
		this.tparselinks = tparselinks;
	}

	public TparselinksEntity getTparselink() {
		return tparselink;
	}

	public void setTparselink(TparselinksEntity tparselink) {
		this.tparselink = tparselink;
	}

	public TparselinksManager getTparselinksManager() {
		return tparselinksManager;
	}

	public void setTparselinksManager(TparselinksManager tparselinksManager) {
		this.tparselinksManager = tparselinksManager;
	}

	/*
	 * Parsetag Setter & Getter
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
	 * URL setter and getter
	 */
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

	/*
	 * tbusinesstype setter and getter
	 */
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

	public List<TbusinesstypeEntity> getTbusinesstypes() {
		return tbusinesstypes;
	}

	public void setTbusinesstypes(List<TbusinesstypeEntity> tbusinesstypes) {
		this.tbusinesstypes = tbusinesstypes;
	}

	/*
	 * *******************************************************************************
	 * JSP parameters
	 * ***********************************************************
	 * ********************
	 */
	// receive uid
	private int businesstypeid;

	public int getBusinesstypeid() {
		return businesstypeid;
	}

	public void setBusinesstypeid(int businesstypeid) {
		this.businesstypeid = businesstypeid;
	}

	/*
	 * ********************************************************************************************************
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.Preparable#prepare() This method will be
	 * called before any of Action method is invoked; So some pre-processing if
	 * required.
	 */

	@Override
	public void prepare() throws Exception {
		tparsetag = null;
		turl = null;
		tparselinks = null;
	}

	/*
	 * ************************parseLinks methods
	 */
	public String listBusinessLinks() {
		logger.info("listLinks method called");
		// for passing typeid
		tbusinesstypes = tbusinesstypeManager.getAllTypes();
		tparselinks = tparselinksManager.getAllLinks();
		businesstypeid = tbusinesstype.getId();
		return SUCCESS;
	}

	public String listBusinessTypeLinks() {
		logger.info("listTypeLinks method called");
		tbusinesstypes = tbusinesstypeManager.getAllTypes();
		tparselinks = tparselinksManager.getAllLinks();
		int urlid = turl.getId();

		for (int urlIndex = 0; urlIndex < turlManager.getAllURLs().size(); urlIndex++) {
			if (turlManager.getAllURLs().get(urlIndex).getId() == urlid) {
				turl = turlManager.getAllURLs().get(urlIndex);
				break;
			}
		}
		businesstypeid = turl.getTypeid();
		return SUCCESS;
	}

	public String addLink() {
		logger.info("addURLTag method called");
		tparselinksManager.addlink(tparselink);
		return SUCCESS;
	}

	public String deleteLink() {
		logger.info("deleteURLTag method called");
		tparselinksManager.deletelink(tparselink.getId());
		return SUCCESS;
	}

	/*
	 * For Jsoup Parse
	 */
	public String AddBusinessLinks() {
		logger.info("AddLinks method called");
		// Get content from database
		tparselinks = tparselinksManager.getAllLinks();
		int tagid = tparsetag.getId();

		for (int tagIndex = 0; tagIndex < tparsetagManager.getAllTags().size(); tagIndex++) {
			if (tparsetagManager.getAllTags().get(tagIndex).getId() == tagid) {
				tparsetag = tparsetagManager.getAllTags().get(tagIndex);
				break;
			}
		}

		int urlid = tparsetag.getUrlid();
		for (int urlIndex = 0; urlIndex < turlManager.getAllURLs().size(); urlIndex++) {
			if (turlManager.getAllURLs().get(urlIndex).getId() == urlid) {
				turl = turlManager.getAllURLs().get(urlIndex);
				break;
			}
		}

		String urllink = turl.getUrllink();
		int typeid = turl.getTypeid();
		String content = tparsetag.getContent();
		String[] tags = content.split(";");	
		int levelSize = tags.length;

		//parse HTML page
		ParseURL purl = new ParseURL(urllink, levelSize, tags);
		String[][] parseResult = purl.getParseContent();

		for (int index = 0; index < parseResult[0].length; index++) {
			String outlinktitle = parseResult[0][index].toString();
			System.out.println(outlinktitle);
			String outlinkurl = parseResult[1][index].toString();

			boolean isExist = false;
			for (int linkIndex = 0; linkIndex < tparselinks.size(); linkIndex++) {
				if ((tparselinks.get(linkIndex).getOutlinkurl()
						.equals(outlinkurl))
						&& (tparselinks.get(linkIndex).getOutlinktitle()
								.equals(outlinktitle))) {
					isExist = true;
					break;
				}
			} // end for linkIndex

			if (isExist) {
				System.out.println("The record has existed!!");
				continue;
			}
			TparselinksEntity ntparselink = new TparselinksEntity();
			ntparselink.setUrlid(urlid);
			ntparselink.setTypeid(typeid);
			ntparselink.setOutlinktitle(outlinktitle);
			ntparselink.setOutlinkurl(outlinkurl);
			tparselinksManager.addlink(ntparselink);
		}

		return SUCCESS;
	}

}
