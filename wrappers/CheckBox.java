package com.wrappers;

import org.openqa.selenium.WebElement;

public interface CheckBox extends WebElement {
	void toggle();
    void check();
    void uncheck();
    boolean isChecked();
}