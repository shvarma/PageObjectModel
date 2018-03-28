package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.wrappers.CheckBox;


public class HomePage implements IBasePage{

	@FindBy (xpath = "//title[text()='Application Form']")
	public WebElement pageIndentifier;
	
	@FindBy(name = "username")
	public WebElement loginUserName;
	
	@FindBy(name = "password")
	public WebElement loginUserPwd;
	
	@FindBy(name = "travel")
	public CheckBox travelCheckBox;
	
	@FindBy(xpath = "//b[text()='Help']")
	public WebElement helpLink;

	public void assertPagePresence() {
		Assert.assertTrue(pageIndentifier.isDisplayed()); 
	}
	
}
