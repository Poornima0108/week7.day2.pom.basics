package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.LoginPage;

import base.ProjectSpecificMethods;

public class TC003_DuplicateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFilePath = "./testData/DuplicateLead.xlsx";
	}
	
	@Test(dataProvider = "Dynamic_Data")
	public void runTC003(String username, String password, String phone) throws InterruptedException {
		new LoginPage(driver).enterUsername(username).enterPassword(password).clickLoginButton_positive().clickCRMSFA().clickLeadsTab().clickFindLeads().enterPhone(phone).clickFindLeadsButton().clickFirstResultingLead().clickDuplicateLead().submitDuplicateLead();
	}
	
}
