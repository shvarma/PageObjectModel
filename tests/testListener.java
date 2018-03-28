package com.tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.ListenersImpl;
import com.helpers.ElementsHelper;
import com.pages.BasePage;
import com.pages.HomePage;

public class testListener extends BasePage{

	@Test(groups = { "LISTENERS" })
	public void testcaseListener() throws IOException {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		System.out.println("Testcase : testListener - testcaseListener");
		WebElement element = homePage.helpLink;
		element.click();
	}
}
