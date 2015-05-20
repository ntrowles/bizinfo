package com.lgq.tools;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class getBean {
	private ApplicationContext ctx;
	public getBean() {
		super();
		String  path="classpath:resources/beans.xml";   
		ApplicationContext   ctxnew=new   FileSystemXmlApplicationContext(path);
		this.ctx = ctxnew;
	}
	public Object getBean(String BeansName) {
		// TODO Auto-generated method stub
		Object n=this.ctx.getBean(BeansName);
		return n;
	}

}
