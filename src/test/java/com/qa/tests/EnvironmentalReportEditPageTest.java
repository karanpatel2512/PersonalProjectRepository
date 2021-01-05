package com.qa.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.base;
import com.qa.pages.EnvironmentalReportDeletePage;
import com.qa.pages.EnvironmentalReportEditPage;

public class EnvironmentalReportEditPageTest extends base {

	EnvironmentalReportEditPage eredit;

	@BeforeClass
	public void Setup() {

		eredit = new EnvironmentalReportEditPage();
	}

	@Test(priority = 13)
	public void editTest() {
		eredit.selectType();
		eredit.Button();
	}

}
