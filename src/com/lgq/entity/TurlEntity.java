package com.lgq.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="turl")
public class TurlEntity {
	
	 @Id
	    @Column(name="id")
	    @GeneratedValue
	    private Integer id;
	     
	    @Column(name="urllink")
	    private String urllink;
	    
	    @Column(name="typeid")
	    private Integer typeid;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getUrllink() {
			return urllink;
		}

		public void setUrllink(String urllink) {
			this.urllink = urllink;
		}

		public Integer getTypeid() {
			return typeid;
		}

		public void setTypeid(Integer typeid) {
			this.typeid = typeid;
		}

}
