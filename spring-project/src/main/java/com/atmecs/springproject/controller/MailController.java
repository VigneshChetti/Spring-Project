package com.atmecs.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.atmecs.springproject.mail.MailSender;

@RestController
public class MailController {
	
	private MailSender mailSender;
	
	public MailController(@Qualifier("smtpMailSender") MailSender smtp) {
		this.mailSender = smtp;
	}

	@RequestMapping("/mail")
	public String mail() {
		
		mailSender.send(" vignesh@atmecs.com", "A test mail", "Body of the test mail");
		return "Mail sent";
	}
	

}
