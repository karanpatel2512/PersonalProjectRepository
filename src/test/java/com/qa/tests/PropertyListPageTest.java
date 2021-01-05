package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.base;
import com.qa.pages.ModuleDetailPage;
import com.qa.pages.PropertyListPage;

public class PropertyListPageTest extends base {
	PropertyListPage propertylistpage;
	ModuleDetailPage moduledetailpage;

	@BeforeClass
	public void Setup() {

		propertylistpage = new PropertyListPage();
		moduledetailpage = new ModuleDetailPage();
	}

	@Test(priority = 3)
	public void propertyListHeaderDisplayTest() {
		boolean flag = propertylistpage.propertyListHeaderDisplay();
		Assert.assertEquals(flag, true);
	}

	@Test(priority = 4)
	public void firstEnvironmentalDetailTest() throws InterruptedException {
		moduledetailpage = propertylistpage.firstEnvironmentalDetail();

	}

	@Test(priority = 5)
	public void getFirstPropertyNameandNumber() {
		propertylistpage.getFirstPropertyNameandNumber();
	}
}
