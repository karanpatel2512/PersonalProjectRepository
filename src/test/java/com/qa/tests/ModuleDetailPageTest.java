package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.base;
import com.qa.pages.ModuleDetailPage;

public class ModuleDetailPageTest extends base {
	ModuleDetailPage moduledetailpage;

	@BeforeClass
	public void Setup() {
		moduledetailpage = new ModuleDetailPage();
	}

	@Test(priority = 6)
	public void comparePropertyLabelTest() {
		boolean flag = moduledetailpage.comparePropertyLabel();
		Assert.assertTrue(flag);
	}

	@Test(priority = 7)
	public void menuTest() {
		moduledetailpage.Menu();
	}

	@Test(priority = 8)
	public void environmentalReportsMenuTest() throws InterruptedException {
		moduledetailpage.EnvironmentalReportsMenu();
	}

	@Test(priority = 9)
	public void EnvironmentalReportAddButtonTest() {
		moduledetailpage.EnvironmentalReportAdd();
	}

}