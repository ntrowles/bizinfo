package com.lgq.controller;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;

import com.lgq.entity.TbusinesstypeEntity;
import com.lgq.entity.TparselinksEntity;
import com.lgq.entity.TparsetagEntity;
import com.lgq.entity.TtypefrequencyEntity;
import com.lgq.entity.TurlEntity;
import com.lgq.service.TbusinesstypeManager;
import com.lgq.service.TparselinksManager;
import com.lgq.service.TparsetagManager;
import com.lgq.service.TtypefrequencyManager;
import com.lgq.service.TurlManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class EditParseLinksAction extends ActionSupport implements Preparable {
	private static final long serialVersionUID = 1L;

	// Logger configured using log4j
	private static final Logger logger = Logger
			.getLogger(EditParseLinksAction.class);
	// List of entities; Setter and Getter are below
	private List<TurlEntity> turls;
	private List<TbusinesstypeEntity> tbusinesstypes;
	private List<TparsetagEntity> tparsetags;
	private List<TparselinksEntity> tparselinks;
	private List<TtypefrequencyEntity> ttypefrequencies;
	// an entity
	private TurlEntity turl;
	private TbusinesstypeEntity tbusinesstype;
	private TparsetagEntity tparsetag;
	private TparselinksEntity tparselink;
	private TtypefrequencyEntity ttypefrequency;

	// manager injected by spring context;
	private TurlManager turlManager;
	private TbusinesstypeManager tbusinesstypeManager;
	private TparsetagManager tparsetagManager;
	private TparselinksManager tparselinksManager;
	private TtypefrequencyManager ttypefrequencyManager;

	/*
	 * type frequency setter and getter
	 */
	public List<TtypefrequencyEntity> getTtypefrequencies() {
		return ttypefrequencies;
	}

	public void setTtypefrequencies(List<TtypefrequencyEntity> ttypefrequencies) {
		this.ttypefrequencies = ttypefrequencies;
	}

	public TtypefrequencyEntity getTtypefrequency() {
		return ttypefrequency;
	}

	public void setTtypefrequency(TtypefrequencyEntity ttypefrequency) {
		this.ttypefrequency = ttypefrequency;
	}

	public TtypefrequencyManager getTtypefrequencyManager() {
		return ttypefrequencyManager;
	}

	public void setTtypefrequencyManager(
			TtypefrequencyManager ttypefrequencyManager) {
		this.ttypefrequencyManager = ttypefrequencyManager;
	}

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
	// receive business type id
	private int businesstypeid;

	public int getBusinesstypeid() {
		return businesstypeid;
	}

	public void setBusinesstypeid(int businesstypeid) {
		this.businesstypeid = businesstypeid;
	}

	// receive link id
	private int linkID;

	public int getLinkID() {
		return linkID;
	}

	public void setLinkID(int linkID) {
		this.linkID = linkID;
	}

	private int pageNumber;

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	private int currentpage;

	public int getCurrentpage() {
		return currentpage;
	}

	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}

	private int startpagenumber;

	public int getStartpagenumber() {
		return startpagenumber;
	}

	public void setStartpagenumber(int startpagenumber) {
		this.startpagenumber = startpagenumber;
	}

	// for passing the url to action
	private String linkurl;

	public String getLinkurl() {
		return linkurl;
	}

	public void setLinkurl(String linkurl) {
		this.linkurl = linkurl;
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
		ttypefrequency = null;
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

	
	//For statistics of website visit times for different categories
	public String updateLinkStatistics() {
		logger.info("update link statistics method called");
		tparselinks = tparselinksManager.getAllLinks();
		int linkid = tparselink.getId();
		tparselinksManager.updateStatistics(linkid);

		// System.out.println(linkid);
		for (int index = 0; index < tparselinks.size(); index++)
			if (tparselinks.get(index).getId() == linkid) {
				linkurl = tparselinks.get(index).getOutlinkurl();
				break;
			}
		// System.out.println(linkurl);
		return "redirect";
	}

	public String listPageLinks() {
		logger.info("listpartLinks method called");
		// for passing typeid
		tbusinesstypes = tbusinesstypeManager.getAllTypes();

		int listSize = 20;
		currentpage = pageNumber;
		startpagenumber = (currentpage - 1) * listSize;

		tparselinks = tparselinksManager.getpartLinks(pageNumber, listSize,
				businesstypeid);
		if (currentpage == 1) {
			tbusinesstypeManager.UpdateStatistics(businesstypeid);
			// update frequency
			ttypefrequency = new TtypefrequencyEntity();
			ttypefrequency.setTypeid(businesstypeid);
			ttypefrequency.setStatus(1);
			ttypefrequency.setVisittimes(1);
			Date date = new Date();
			Timestamp timeStamp = new Timestamp(date.getTime());
			ttypefrequencies = ttypefrequencyManager.getAllTypesFrequency();

			for (int index = 0; index < ttypefrequencies.size(); index++) {
				if (ttypefrequencies.get(index).getTypeid() == businesstypeid
						&& ttypefrequencies.get(index).getStatus() == 1) {
					Timestamp historytime = ttypefrequencies.get(index)
							.getVisitdate();
					int diffdays = getDaysBetween(timeStamp, historytime);
					if (diffdays != 0) {
						ttypefrequencyManager.UpdateStatus(ttypefrequencies
								.get(index).getId());
						ttypefrequency.setStatus(1);
						ttypefrequencyManager.addTypeFrequency(ttypefrequency);
						return SUCCESS;
					} else {
						ttypefrequencyManager
								.UpdateTypeFrequency(ttypefrequencies
										.get(index).getId());
						return SUCCESS;
					}
				}

			}// end for
				// System.out.println(ttypefrequency.getStatus() +
				// " --------- "+ttypefrequency.getVisittimes());
				// if a new record, just add it
			ttypefrequencyManager.addTypeFrequency(ttypefrequency);
		}
		return SUCCESS;
	}

	public String listNextPageLinks() {
		logger.info("listpartLinks method called");
		tbusinesstypes = tbusinesstypeManager.getAllTypes();

		int listSize = 20;
		int nextpage = 0;

		int index = 0;
		while (index < tparselinksManager.getAllLinks().size()) {
			if (businesstypeid == tparselinksManager.getAllLinks().get(index)
					.getTypeid()) {
				nextpage++;
			}
			index++;
		}

		if (currentpage < nextpage)
			currentpage = currentpage + 1;
		else
			currentpage = nextpage - 1;

		pageNumber = currentpage;
		startpagenumber = (currentpage - 1) * listSize;

		tparselinks = tparselinksManager.getpartLinks(pageNumber, listSize,
				businesstypeid);// tparselinksManager.getAllLinks();
		return SUCCESS;
	}

	public String listPrePageLinks() {
		logger.info("listpartLinks method called");
		// for passing typeid
		tbusinesstypes = tbusinesstypeManager.getAllTypes();

		int listSize = 20;

		if (currentpage > 1)
			currentpage = currentpage - 1;
		else
			currentpage = 1;

		pageNumber = currentpage;
		startpagenumber = (currentpage - 1) * listSize;

		tparselinks = tparselinksManager.getpartLinks(pageNumber, listSize,
				businesstypeid);// tparselinksManager.getAllLinks();
		return SUCCESS;
	}

	public String listLinks() {
		logger.info("listLinks method called");
		// for passing typeid
		tbusinesstypes = tbusinesstypeManager.getAllTypes();
		tparselinks = tparselinksManager.getAllLinks();

		for (int index = 0; index < tparselinks.size(); index++) {
			if (tparselinks.get(index).getId() == tparselink.getId()) {
				businesstypeid = tparselinks.get(index).getTypeid();
				break;
			}
		}

		return SUCCESS;
	}

	// admin directly adding links
	public String adminListLinks() {
		logger.info("AdminListLinks method called");
		// for passing typeid
		tbusinesstypes = tbusinesstypeManager.getAllTypes();
		return SUCCESS;
	}

	public String addLink() {
		logger.info("addLinks method called");
		Date date = new Date();
		Timestamp timeStamp = new Timestamp(date.getTime());
		tparselink.setOutlinkdate(timeStamp);
		tparselinksManager.addlink(tparselink);
		return SUCCESS;
	}

	public String editLink() {
		logger.info("edit a Link method called");
		tbusinesstypes = tbusinesstypeManager.getAllTypes();
		tparselinks = tparselinksManager.getAllLinks();
		linkID = tparselink.getId();
		System.out.println("----------****----" + linkID);
		return SUCCESS;
	}

	public String updateLink() {
		logger.info("update a Link method called");
		tbusinesstypes = tbusinesstypeManager.getAllTypes();
		tparselinks = tparselinksManager.getAllLinks();
		for (int index = 0; index < tparselinks.size(); index++) {
			if (tparselinks.get(index).getId() == tparselink.getId()) {
				TparselinksEntity ntparselink = tparselinks.get(index);
				if (tparselink.getTypeid() == null)
					tparselink.setTypeid(ntparselink.getTypeid());
				tparselink.setStatistics(ntparselink.getStatistics());
				tparselink.setOutlinkdate(ntparselink.getOutlinkdate());
			}
		}
		tparselinksManager.updateLink(tparselink);

		return SUCCESS;
	}

	public String deleteLink() {
		logger.info("delete Links method called");
		tparselinksManager.deletelink(tparselink.getId());
		return SUCCESS;
	}

	public String deleteHistoryLink() {
		logger.info("delete history link method called");

		Date date = new Date();
		Timestamp timeStamp = new Timestamp(date.getTime());
		tparselinks = tparselinksManager.getAllLinks();
		for (int index = 0; index < tparselinks.size(); index++) {
			if (tparselinks.get(index).getTypeid() == tparselink.getTypeid()) {
				Timestamp historytime = tparselinks.get(index).getOutlinkdate();
				int diffdays = getDaysBetween(timeStamp, historytime);
				if (diffdays != 0) {
					tparselinksManager.deletelink(tparselinks.get(index)
							.getId());
				}
			}
		}// end for

		return SUCCESS;
	}

	private int getDaysBetween(Timestamp start, Timestamp end) {

		boolean negative = false;
		if (end.before(start)) {
			negative = true;
			Timestamp temp = start;
			start = end;
			end = temp;
		}

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(start);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);

		GregorianCalendar calEnd = new GregorianCalendar();
		calEnd.setTime(end);
		calEnd.set(Calendar.HOUR_OF_DAY, 0);
		calEnd.set(Calendar.MINUTE, 0);
		calEnd.set(Calendar.SECOND, 0);
		calEnd.set(Calendar.MILLISECOND, 0);

		if (cal.get(Calendar.YEAR) == calEnd.get(Calendar.YEAR)) {
			if (negative)
				return (calEnd.get(Calendar.DAY_OF_YEAR) - cal
						.get(Calendar.DAY_OF_YEAR)) * -1;
			return calEnd.get(Calendar.DAY_OF_YEAR)
					- cal.get(Calendar.DAY_OF_YEAR);
		}

		int days = 0;
		while (calEnd.after(cal)) {
			cal.add(Calendar.DAY_OF_YEAR, 1);
			days++;
		}
		if (negative)
			return days * -1;
		return days;
	}

}
