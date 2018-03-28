package com.helpers;

import org.openqa.selenium.WebElement;

public class ElementsHelper {

	public void check(WebElement element) {
		if (!element.isSelected())
			element.click();
		else
			System.out.println("Checkbox is already checked!");
	}
}
