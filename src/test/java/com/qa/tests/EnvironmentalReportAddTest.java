package com.qa.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.base;
import com.qa.pages.EnvironmentalReportAddPage;
import com.qa.pages.ModuleDetailPage;
import com.qa.pages.PropertyListPage;

public class EnvironmentalReportAddTest extends base {
	EnvironmentalReportAddPage eradd;

	@BeforeClass
	public void Setup() {

		eradd = new EnvironmentalReportAddPage();

	}

	@Test(priority = 10)
	public void addReport() {
		eradd.selectType();
		eradd.titleAdd(prop.getProperty("title"));
		eradd.dateAdd(prop.getProperty("date"));
		eradd.companyAdd(prop.getProperty("company"));
		eradd.authotAdd(prop.getProperty("author"));
		eradd.descriptionAdd(prop.getProperty("description"));
		eradd.saveButton();
	}

}
