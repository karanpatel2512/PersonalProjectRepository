package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.base;

public class EnvironmentalReportDeletePage extends base {

	String title = prop.getProperty("title");

	// Page factory or Object repositories
	@FindBy(xpath = "//input[@placeholder=\"Filter\"]")
	WebElement SearchBar;

	@FindBy(xpath = "//span[contains(text(),'BacancyAutoTask')]//parent::td")
	WebElement Report;

	@FindBy(id = "delete-btn")
	WebElement DeleteButton;

	@FindBy(xpath = "//td[@ng-repeat='section in getEnabledSections()'][contains(.,'Check Edit')]")
	WebElement DeleteButtonPopup;

	public EnvironmentalReportDeletePage() {
		PageFactory.initElements(driver, this);
	}

	public void searchReport(String ReportTitle) {
		SearchBar.sendKeys(ReportTitle);
	}

	public void reportTitle() {
		Report.click();
	}

	public void deleteReport() {
		DeleteButton.click();
		DeleteButtonPopup.click();
	}

}
