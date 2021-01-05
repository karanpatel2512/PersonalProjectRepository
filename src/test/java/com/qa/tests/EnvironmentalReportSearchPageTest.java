package com.qa.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.base;
import com.qa.pages.EnvironmentalReportDeletePage;
import com.qa.pages.EnvironmentalReportEditPage;
import com.qa.pages.EnvironmentalReportSearchpage;

public class EnvironmentalReportSearchPageTest extends base {

	EnvironmentalReportSearchpage ersearch;

	@BeforeClass
	public void Setup() {

		ersearch = new EnvironmentalReportSearchpage();
	}

	@Test(priority = 11)
	public void EnvironmentaReportSearchpageTest() {
		ersearch.searchReport(prop.getProperty("title"));
	}

	@Test(priority = 12)
	public EnvironmentalReportEditPage reportTitle() {
		ersearch.reportTitle();
		return new EnvironmentalReportEditPage();
	}

}
