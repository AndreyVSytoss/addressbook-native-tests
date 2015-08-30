package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.fw.Contact;

public class TestContactDeletion extends TestBase{

	@Test
	public void deleteContactTest(){
		Contact contact = new Contact().setFirstName("abc").setLastName("afd");
		app.getContactHelper().createContact(contact);
		app.getContactHelper().deleteFirstContact();
		Contact firstContact = app.getContactHelper().getFirstContact();
		Assert.assertNotEquals(firstContact, contact);
	}
	
}
