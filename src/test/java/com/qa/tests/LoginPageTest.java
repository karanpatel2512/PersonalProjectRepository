package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.base.base;
import com.qa.pages.LoginPage;
import com.qa.pages.PropertyListPage;

public class LoginPageTest extends base {

	LoginPage loginpage;
	PropertyListPage propertyListPage;

	public LoginPageTest() {
		super();
	}

	@BeforeSuite
	public void Setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		propertyListPage = new PropertyListPage();
	}

	@Test(priority = 1)
	public void validateLogoTest() {
		boolean flag = loginpage.validateLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 2)
	public void loginTest() {
		propertyListPage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

}
