package com.wrappers;

import org.openqa.selenium.WebElement;

public class CheckBoxImpl extends WebElementImpl implements CheckBox {
	 
	private final WebElement element;
	
	public CheckBoxImpl(WebElement element) {
		super(element);
		this.element = element;
		// TODO Auto-generated constructor stub
	}

	public void toggle() {
		// TODO Auto-generated method stub
		
	}


	public void check() {		
		if (!element.isSelected())
			element.click();
		else
			System.out.println("Checkbox is already checked!");
	}


	public void uncheck() {
		// TODO Auto-generated method stub
		
	}

	public boolean isChecked() {
		// TODO Auto-generated method stub
		return false;
	}
	 
   
}