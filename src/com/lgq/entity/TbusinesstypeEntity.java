package com.lgq.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbusinesstype")
public class TbusinesstypeEntity {
     
    @Id
    @Column(name="id")
    @GeneratedValue
    private Integer id;
     
    @Column(name="typename")
    private String typename;
    
    @Column(name="statistics")
    private int statistics;
     
    
    public int getStatistics() {
		return statistics;
	}
	public void setStatistics(int statistics) {
		this.statistics = statistics;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}