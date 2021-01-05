package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.base;

public class EnvironmentalReportAddPage extends base {

	// Page factory or Object repositories
	@FindBy(id = "select-Type")
	WebElement ReportType;

	@FindBy(id = "input-Title")
	WebElement Title;

	@FindBy(id = "date-Date")
	WebElement Date;

	@FindBy(id = "input-Company")
	WebElement Company;

	@FindBy(id = "input-Author")
	WebElement Author;

	@FindBy(id = "textarea-Description")
	WebElement Description;

	@FindBy(id = "Save-btn")
	WebElement SaveButton;

	public EnvironmentalReportAddPage() {
		PageFactory.initElements(driver, this);
	}

	/* Actions */
	public void selectType() {
		Select type = new Select(ReportType);
		type.selectByVisibleText("Checklist");
	}

	public void titleAdd(String title) {
		Title.sendKeys(title);
	}

	public void dateAdd(String date) {
		Date.sendKeys(date);
	}

	public void companyAdd(String company) {
		Company.sendKeys(company);
	}

	public void authotAdd(String author) {
		Author.sendKeys(author);
	}

	public void descriptionAdd(String description) {
		Description.sendKeys(description);
	}

	public EnvironmentalReportSearchpage saveButton() {
		SaveButton.click();
		return new EnvironmentalReportSearchpage();
	}

}
