package com.lgq.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ttypefrequency")
public class TtypefrequencyEntity {
     
    @Id
    @Column(name="id")
    @GeneratedValue
    private Integer id;
    
    @Column(name="typeid")
    private int typeid;
    
    @Column(name="visitdate")
    private Timestamp visitdate;
    
    @Column(name="visittimes")
    private int visittimes;
    
    @Column(name="status")
    private int status;
    
    
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public Timestamp getVisitdate() {
		return visitdate;
	}
	public void setVisitdate(Timestamp visitdate) {
		this.visitdate = visitdate;
	}
	public int getVisittimes() {
		return visittimes;
	}
	public void setVisittimes(int visittimes) {
		this.visittimes = visittimes;
	}
    
}