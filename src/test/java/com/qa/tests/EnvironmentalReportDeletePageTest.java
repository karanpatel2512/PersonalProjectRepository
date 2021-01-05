package com.qa.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.base;
import com.qa.pages.EnvironmentalReportDeletePage;
import com.qa.pages.ModuleDetailPage;
import com.qa.pages.PropertyListPage;

public class EnvironmentalReportDeletePageTest extends base {

	EnvironmentalReportDeletePage erdelete;

	@BeforeClass
	public void Setup() {

		erdelete = new EnvironmentalReportDeletePage();
	}

	@Test(priority = 14)
	public void EnvironmentaReportSearchpageTest() {
		erdelete.searchReport(prop.getProperty("title"));
		erdelete.reportTitle();
	}

	@Test(priority = 15)
	public void deleteReportTest() {
		erdelete.deleteReport();
	}

}
