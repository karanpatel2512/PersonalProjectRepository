package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.base;

public class EnvironmentalReportEditPage extends base {

	String title = prop.getProperty("title");

	// Page factory or Object repositories

	@FindBy(id = "select-Type")
	WebElement ReportType;

	@FindBy(id = "Update-btn")
	WebElement UpdateButton;

	public EnvironmentalReportEditPage() {
		PageFactory.initElements(driver, this);
	}

	public void selectType() {
		Select type = new Select(ReportType);
		type.selectByVisibleText("Asbestos Inspection Form");
	}

	public EnvironmentalReportDeletePage Button() {
		UpdateButton.click();
		return new EnvironmentalReportDeletePage();
	}

}
