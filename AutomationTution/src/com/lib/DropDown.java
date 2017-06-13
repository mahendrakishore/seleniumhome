package com.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void selecDropDown(WebDriver driver, String locator,String text){
		
		Select select = new Select(driver.findElement(By.name(locator)));
		select.selectByVisibleText(text);
	}

}
