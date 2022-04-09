package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods{
public DuplicateLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

public ViewLeadPage submitDuplicateLead() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);
}
}
