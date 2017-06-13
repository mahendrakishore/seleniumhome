package com.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Javascript {
	
	static JavascriptExecutor jse ;
	
	public static void scrollIntoView(WebDriver driver,String locator ){
		
		 jse = (JavascriptExecutor)driver;
		 WebElement text = driver.findElement(By.name(locator));
		 jse.executeScript("arguments[0].scrollIntoView(true);",text);
	}

	public static void scrollWebPage(WebDriver driver){
		jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,800)");
	}
	
}
