package com.lzq.selenium.imoocTest.util;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
	public static void sendToEmail(String content){
		SimpleEmail sEmail = new SimpleEmail();
		sEmail.setHostName("smtp.163.com");
		sEmail.setSSL(true);
		sEmail.setSmtpPort(465);
		sEmail.setAuthentication("13824480907@163.com", "abc123");
		try {
			sEmail.setFrom("13824480907@163.com");
			sEmail.addTo("lizhanqiang2018@163.com");
			sEmail.setSubject("selenium自动化测试邮件");
			
			sEmail.setContent(content, "text/html;charset=utf-8");
			sEmail.send();
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	public static void main(String[] args){
		sendToEmail("成功了");
	}

}
