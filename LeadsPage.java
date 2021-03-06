package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods {
public LeadsPage(RemoteWebDriver driver) {
	this.driver = driver;
}

public CreateLeadPage clickCreateLead() {
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLeadPage(driver);
}

public FindLeadsPage clickFindLeads() {
	driver.findElement(By.linkText("Find Leads")).click();
	return new FindLeadsPage(driver);
}
}
