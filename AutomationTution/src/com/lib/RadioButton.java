package com.lib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {
	
	
	public static void clickRadioButton(WebDriver driver,String name, String value){
		
		List<WebElement> radios = driver.findElements(By.name(name));
		System.out.println(radios.size());
		for(int i = 0 ; i<radios.size();i++){
			if(radios.get(i).getAttribute("").equals(value)){
				radios.get(i).click();
			}
		}
	}

}
