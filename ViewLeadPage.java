package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
public ViewLeadPage(RemoteWebDriver driver) {
	this.driver = driver;
}

public ViewLeadPage verifyLeadID() {
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println(text);
	return this;
}

public EditLeadPage clickEdit() {
	driver.findElement(By.linkText("Edit")).click();
	return new EditLeadPage(driver);
}

public DuplicateLeadPage clickDuplicateLead() {
	driver.findElement(By.linkText("Duplicate Lead")).click();
	return new DuplicateLeadPage(driver);
}

}
