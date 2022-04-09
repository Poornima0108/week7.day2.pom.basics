package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.LoginPage;

import base.ProjectSpecificMethods;

public class TC002_EditLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFilePath = "./testData/EditLead.xlsx";
	}
	
	@Test(dataProvider = "Dynamic_Data")
	public void runTC002(String username, String password, String phone, String companyName) throws InterruptedException {
		new LoginPage(driver).enterUsername(username).enterPassword(password).clickLoginButton_positive().clickCRMSFA().clickLeadsTab().clickFindLeads().enterPhone(phone).clickFindLeadsButton().clickFirstResultingLead().clickEdit().enterCompanyName(companyName).clickUpdate();
		
	}
	
}
