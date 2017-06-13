package com.lib;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	
	public void takesScreenshot(WebDriver driver, String name){
		
		try{TakesScreenshot ts = (TakesScreenshot)driver;
		File ssfile = ts.getScreenshotAs(OutputType.FILE);
		String location = "C:\\Users\\mahen\\workspace\\Screenshot\\"+name+".png" ;
		FileUtils.copyFile(ssfile,new File(location) );}
		catch(Exception e){
			System.out.println("Screenshot not taken");
		}			}
	

	
	}


