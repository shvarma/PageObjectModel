package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlPackage;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.helpers.UtilityHelper;

public class TestRunner {
	public static void main(String args[]) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		System.out.println("Test Runner...");
		Date myDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
		String timeStamp = sdf.format(myDate);
		
		TestNG myTestNG = new TestNG();
		XmlSuite mySuite = new XmlSuite();
		mySuite.setName("Suite");
		XmlTest myTest = new XmlTest(mySuite);
		myTest.setName("Test");

		UtilityHelper uhObj = new UtilityHelper();
		String isGroup = uhObj.getString("isGroup", Global.configFile);
		String toExecute = uhObj.getString("toExecute", Global.configFile);

		if (Boolean.parseBoolean(isGroup)) {
			List<String> groupNames = new ArrayList<String>();
			groupNames.add("SETUP");
			groupNames.add(toExecute);
			groupNames.add("TEARDOWN");
			myTest.setIncludedGroups(groupNames);
		}

//		 List<XmlClass> myClasses = new ArrayList<XmlClass>();
//		 myClasses.add(new XmlClass("com.tests.testScenario1"));
//		 myClasses.add(new XmlClass("com.tests.testScenario2"));
//		 myTest.setXmlClasses(myClasses);

		List<XmlPackage> myPackages = new ArrayList<XmlPackage>();
		myPackages.add(new XmlPackage("com.tests.*"));
		myPackages.add(new XmlPackage("com.pages.*"));
		myTest.setXmlPackages(myPackages);

		List<XmlTest> myTests = new ArrayList<XmlTest>();
		myTests.add(myTest);
		mySuite.setTests(myTests);

		List<XmlSuite> mySuites = new ArrayList<XmlSuite>();
		mySuites.add(mySuite);
		myTestNG.setXmlSuites(mySuites);
			
		myTestNG.setOutputDirectory("reports/" + timeStamp);
		myTestNG.run();
	}
}