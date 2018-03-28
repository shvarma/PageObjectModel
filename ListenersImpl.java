package com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class ListenersImpl extends AbstractWebDriverEventListener{

	public void beforeClickOn(WebElement element, WebDriver myTestDriver) {
		System.out.println("Element text : " + element.getText() + ", Element tag : " + element.getTagName() + " - element is clicked!");
	}
	
	public void afterClickOn(WebElement element, WebDriver myTestDriver){
		System.out.println("Landed on url : " +  myTestDriver.getCurrentUrl());
	}
	
	public void onException(java.lang.Throwable throwable, WebDriver myTestDriver)  {
		System.out.println("onException>>>>>>>>>>>>>>>>>");

	}
}