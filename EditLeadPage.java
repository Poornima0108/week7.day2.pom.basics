package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
public EditLeadPage(RemoteWebDriver driver) {
	this.driver = driver;
}
public EditLeadPage enterCompanyName(String companyname) {
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyname);
	return this;
}

public ViewLeadPage clickUpdate() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);
}
}
