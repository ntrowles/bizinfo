package com.lgq.tools;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

//import com.sun.mail.iap.Protocol;

public class SendMail {

	public static void main(String[] args) throws Exception {

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
						return new PasswordAuthentication("advertice.lin@gmail.com",
								"lin963541");
					}
				});
		session.setDebug(true);
		Transport transport = session.getTransport();
		InternetAddress addressFrom = new InternetAddress("advertice.lin@gmail.com");
		MimeMessage message = new MimeMessage(session);
		message.setSender(addressFrom);

		//for (int j = 0; j < 5; j++) {
			message.setSubject("Testing javamail plain" + Math.random());
			message.setContent("This is come from Gongqi Lin", "text/plain");
			String sendTo[] = { "advertice.lin@gmail.com", "lgqv2007@163.com" };
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
		//}
	}
}
