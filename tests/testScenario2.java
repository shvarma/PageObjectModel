package com.tests;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.helpers.ElementsHelper;
import com.pages.BasePage;
import com.pages.HomePage;

public class testScenario2 extends BasePage{

	@Test(groups = { "SANITY" })
	public void testcase2() throws IOException {
		ElementsHelper elementsHelper = new ElementsHelper();
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.loginUserName.clear();
		homePage.loginUserName.sendKeys("SANITY3");
		elementsHelper.check(homePage.travelCheckBox);
		System.out.println("Testcase : testScenario2 - testcase2");
	}
}
