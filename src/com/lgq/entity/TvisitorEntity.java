package com.lgq.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tvisitor")
public class TvisitorEntity {
     
    @Id
    @Column(name="id")
    @GeneratedValue
    private Integer id;
     
    @Column(name="macaddress")
    private String macaddress;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMacaddress() {
		return macaddress;
	}

	public void setMacaddress(String macaddress) {
		this.macaddress = macaddress;
	}

	
    
}