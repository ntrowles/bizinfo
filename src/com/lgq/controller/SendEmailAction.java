package com.lgq.controller;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class SendEmailAction extends ActionSupport implements Preparable {
	private static final long serialVersionUID = 1L;

	// Logger configured using log4j
	private static final Logger logger = Logger
			.getLogger(SendEmailAction.class);

	// This method will be called before any of Action method is invoked;
	// So some pre-processing if required.
	@Override
	public void prepare() throws Exception {

	}
	
	private String subject;
	private String name;
	private String email;
	private String feedback;
	private String rurl; //recommend URL
	
	

	public String getRurl() {
		return rurl;
	}



	public void setRurl(String rurl) {
		this.rurl = rurl;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getFeedback() {
		return feedback;
	}



	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}



	public String sendEmail() throws Exception {
		
		System.out.println(name + " - "+email+"-"+ rurl+" - "+"subject"+" - "+ feedback);
		Properties props = new Properties();
		props.setProperty("mail.transport.protocol", "smtp");
		props.setProperty("mail.host", "smtp.gmail.com");

		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		props.put("mail.debug", "true");
		props.put("mail.smtp.socketFactory.port", "465");

		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.socketFactory.fallback", "false");

		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(
								"advertice.lin@gmail.com", "lin963541");
					}
				});
		session.setDebug(true);
		Transport transport = session.getTransport();
		InternetAddress addressFrom = new InternetAddress(
				"advertice.lin@gmail.com");
		MimeMessage message = new MimeMessage(session);
		message.setSender(addressFrom);

		message.setSubject(subject);
		message.setContent("name: "+name +"\n Email: "+email+"\n Recommend URL: "+rurl+"\n Comments:"+feedback, "text/plain; charset=UTF-8");
		String sendTo[] = { "lgqv2007@163.com" };
		if (sendTo != null) {
			InternetAddress[] addressTo = new InternetAddress[sendTo.length];
			for (int i = 0; i < sendTo.length; i++) {
				addressTo[i] = new InternetAddress(sendTo[i]);
			}
			message.setRecipients(Message.RecipientType.TO, addressTo);

		}
		transport.connect();
		transport.send(message);
		transport.close();
		// Transport.send(message);
		System.out.println("DONE");
		return SUCCESS;
	}

}
