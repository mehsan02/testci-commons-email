package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailTest {
	
	private static final String[] TEST_EMAILS = { "ab@bc.com", "a.b@c.org",
			"acbdefghijklmnopqrst@abcdefghijklmnopqrst.com.bd"};
	
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception{
		email = new EmailConcrete();
	}
	
	@Test
	public void testgetHostName() {
		email.setHostName("192.345.3.2");
		assertEquals("192.345.3.2", email.getHostName());
	}
	

}
	
