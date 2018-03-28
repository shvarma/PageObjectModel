package com.tests;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.helpers.ElementsHelper;
import com.pages.BasePage;
import com.pages.HomePage;

public class testScenario1 extends BasePage {

	@Test(groups = { "SMOKE" })
	public void testcase1() throws IOException {
		ElementsHelper elementsHelper = new ElementsHelper();
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.assertPagePresence();
		homePage.loginUserName.clear();
		homePage.loginUserName.sendKeys("SMOKE");
		//elementsHelper.check(homePage.travelCheckBox);
		homePage.travelCheckBox.check();
		System.out.println("Testcase : testScenario1 - testcase1");
	}

//	@Test(groups = { "SANITY" })
//	public void testcase2() throws IOException {
//		ElementsHelper elementsHelper = new ElementsHelper();
//		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
//		homePage.loginUserName.clear();
//		homePage.loginUserName.sendKeys("SANITY1");
//		elementsHelper.check(homePage.travelCheckBox);
//		System.out.println("Testcase : testScenario1 - testcase2");
//	}
//	
//	@Test(groups = { "SANITY" })
//	public void testcase3() throws IOException {
//		ElementsHelper elementsHelper = new ElementsHelper();
//		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
//		homePage.loginUserName.clear();
//		homePage.loginUserName.sendKeys("SANITY2");
//		elementsHelper.check(homePage.travelCheckBox);
//		System.out.println("Testcase : testScenario1 - testcase3");
//	}
}
