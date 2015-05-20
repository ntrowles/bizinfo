package com.lgq.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.opensymphony.xwork2.ActionSupport;
 
public class DownloadAction extends ActionSupport{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private InputStream fileInputStream;
 
	public InputStream getFileInputStream() {
		return fileInputStream;
	}
 
	public String execute() throws Exception {
	    fileInputStream = new FileInputStream(new File("D:\\Project\\J2EE\\apache-tomcat-8.0.5\\ouputdata.xls"));
	    return SUCCESS;
	}
}