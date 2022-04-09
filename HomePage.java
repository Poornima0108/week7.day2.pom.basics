package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
public HomePage(RemoteWebDriver driver) {
	this.driver = driver;
}

public LeadsPage clickLeadsTab() {
	driver.findElement(By.linkText("Leads")).click();
	return new LeadsPage(driver);
}
}
