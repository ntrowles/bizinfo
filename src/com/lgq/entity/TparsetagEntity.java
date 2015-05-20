package com.lgq.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tparsetag")
public class TparsetagEntity {
	
	 @Id
	    @Column(name="id")
	    @GeneratedValue
	    private Integer id;
	     
	    @Column(name="content")
	    private String content;
	    
	    @Column(name="urlid")
	    private Integer urlid;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Integer getUrlid() {
			return urlid;
		}

		public void setUrlid(Integer urlid) {
			this.urlid = urlid;
		}

		

}
