package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.LoginPage;

import base.ProjectSpecificMethods;

public class TC001_CreateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFilePath = "./testData/CreateLead.xlsx";
	}
	
	@Test(dataProvider = "Dynamic_Data")
	public void runTC001(String username, String password, String companyName, String fName, String lName) {
		new LoginPage(driver).enterUsername(username).enterPassword(password).clickLoginButton_positive().clickCRMSFA().clickLeadsTab().clickCreateLead().enterCompanyName(companyName).enterFirstName(fName).enterLastName(lName).clickCreateLeadButton().verifyLeadID();
		
		
	}
	
}
