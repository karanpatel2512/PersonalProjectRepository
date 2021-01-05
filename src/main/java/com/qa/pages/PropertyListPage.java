package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.base;

public class PropertyListPage extends base {

	public String FirstPropertyName;
	public String FirstPropertyNumber;

	// Page Factory or Object Repositories:
	@FindBy(xpath = "//h2[contains(text(),'Property List')]")
	WebElement PropertyListHeader;

	@FindBy(id = "propertyListEnvironmental-0")
	WebElement FirstEnvironmental;

	@FindBy(id = "propertyName-0")
	WebElement NameOfFirstProperty;

	@FindBy(id = "propertyNumber-0")
	WebElement NumberOfFirstProperty;

	public PropertyListPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean propertyListHeaderDisplay() {
		return PropertyListHeader.isDisplayed();
	}

	public String getFirstPropertyNameandNumber() {
		FirstPropertyName = NameOfFirstProperty.getText();
		return FirstPropertyNumber = NumberOfFirstProperty.getText();

	}

	public ModuleDetailPage firstEnvironmentalDetail() throws InterruptedException {
		Thread.sleep(2000);
		FirstEnvironmental.click();
		return new ModuleDetailPage();
	}

}
