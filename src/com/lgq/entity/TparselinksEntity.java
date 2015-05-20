package com.lgq.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tparselinks")
public class TparselinksEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Integer id;

	@Column(name = "urlid")
	private Integer urlid;

	@Column(name = "typeid")
	private Integer typeid;

	@Column(name = "outlinkurl")
	private String outlinkurl;

	@Column(name = "outlinktitle")
	private String outlinktitle;
	
	@Column(name = "outlinkdate")
	private Timestamp outlinkdate;
	
	@Column(name="statistics")
    private int statistics;

	
	public int getStatistics() {
		return statistics;
	}

	public void setStatistics(int statistics) {
		this.statistics = statistics;
	}

	public Timestamp getOutlinkdate() {
		return outlinkdate;
	}

	public void setOutlinkdate(Timestamp outlinkdate) {
		this.outlinkdate = outlinkdate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUrlid() {
		return urlid;
	}

	public void setUrlid(Integer urlid) {
		this.urlid = urlid;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getOutlinkurl() {
		return outlinkurl;
	}

	public void setOutlinkurl(String outlinkurl) {
		this.outlinkurl = outlinkurl;
	}

	public String getOutlinktitle() {
		return outlinktitle;
	}

	public void setOutlinktitle(String outlinktitle) {
		this.outlinktitle = outlinktitle;
	}

}
