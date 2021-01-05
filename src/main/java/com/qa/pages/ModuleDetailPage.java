package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.qa.base.base;

public class ModuleDetailPage extends base {
	PropertyListPage propertylistpage;

	// Page Factory or Object repositories
	@FindBy(id = "current-property-label")
	WebElement CurrentPropertyLabel;

	@FindBy(xpath = "//button[@class = 'icon-menu i-large pointer hamburger-menu']")
	WebElement MenuButton;

	@FindBy(xpath = "//span[text()='Environmental Reports']")
	WebElement EnvironmentalReports;

	@FindBy(id = "add-btn")
	WebElement EnvironmentalReportAddButton;

	public ModuleDetailPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean comparePropertyLabel() {
		String currentLabel = CurrentPropertyLabel.getText();
		String previousLabel = propertylistpage.FirstPropertyName + " - " + propertylistpage.FirstPropertyNumber;

		Assert.assertEquals(currentLabel, previousLabel);
		return false;

	}

	public void Menu() {
		MenuButton.click();
	}

	public void EnvironmentalReportsMenu() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(EnvironmentalReports));
		EnvironmentalReports.click();
	}

	public void EnvironmentalReportAdd() {
		EnvironmentalReportAddButton.click();
	}
}
