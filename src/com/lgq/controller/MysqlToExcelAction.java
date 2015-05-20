package com.lgq.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

public class MysqlToExcelAction extends ActionSupport implements Preparable {
	private static final long serialVersionUID = 1L;

	// Logger configured using log4j
	private static final Logger logger = Logger
			.getLogger(MysqlToExcelAction.class);
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

	Connection con = null;

	private Connection getExcelRef() {
		try {
			String exportFile = "statistics/exportdata.xlsx";
			String url = "jdbc:odbc:DRIVER={Microsoft Excel Driver (*.xls)};"
					+ "DBQ=" + exportFile + ";ReadOnly=0;";
			con = DriverManager.getConnection(url);
			return con;
		} catch (SQLException ex) {
			System.out.println(ex);
			return null;
		}
	}

	public void setDataIntoSheet() {
		PreparedStatement ps;
		tparselinks = tparselinksManager.getAllLinks();
		int tid = tparselink.getTypeid();
		int i = 0;
		int index = 0;
		for (TparselinksEntity s : tparselinks) {

			if (tparselinks.get(index).getTypeid() != tid) {
				index++;
				continue;
			}
			try {
				ps = getExcelRef()
						.prepareStatement(
								"insert into [Sheet1$](NAME,ROLL,MARKS) values(?,?,?) ");
				ps.setString(1, s.getOutlinktitle());
				java.util.Date utilDate = s.getOutlinkdate();
				java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
				ps.setDate(2, sqlDate);
				ps.setString(3, s.getOutlinkurl());
				i = ps.executeUpdate();
				index++;
			} catch (SQLException ex) {

			}

		}
		if (i > 0) {
			System.out.println("Data imported successfully");
		} else {
			System.out.println("Problem in data insertion");
		}
	}
}