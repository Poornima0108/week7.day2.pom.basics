package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods {
	
public FindLeadsPage(RemoteWebDriver driver) {
	this.driver =driver;
}
public FindLeadsPage enterPhone(String phone) {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
	return this;
}

public FindLeadsPage clickFindLeadsButton() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	return this;
}

public ViewLeadPage clickFirstResultingLead() {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return new ViewLeadPage(driver);
}
}
