package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.base.base;

public class LoginPage extends base {

	// Page Factory or OR:
	@FindBy(id = "username-input")
	WebElement username;

	@FindBy(id = "password-input")
	WebElement password;

	@FindBy(id = "sign-in-btn")
	WebElement signin;

	@FindBy(xpath = "(//img[@class= 'center-block'])[1]")
	WebElement logo;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateLogo() {
		wait.until(ExpectedConditions.visibilityOf(logo));
		return logo.isDisplayed();
	}

	public PropertyListPage login(String UN, String PW) {
		username.sendKeys(UN);
		password.sendKeys(PW);
		signin.click();
		return new PropertyListPage();

	}
}
