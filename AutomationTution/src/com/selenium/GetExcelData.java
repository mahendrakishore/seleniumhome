package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.lib.Config;
import com.lib.ExcelReader;

public class GetExcelData {
	Config config = new Config("./src/com/config/Config.properties");
	WebDriver driver;
	
	@Test(dataProvider="workbook")
	public void login(String uname, String pass){
		System.setProperty("webdriver.chrome.driver", config.chrome());
		driver.get(config.url());
		driver.findElement(By.xpath("")).sendKeys(uname);
		driver.findElement(By.xpath("")).sendKeys(pass);
	}

	@DataProvider(name ="workbook")
	public Object[][] dataexcel(){
		
		ExcelReader er = new ExcelReader("./src/com/config/TestData.xlsx");
		int rn = er.rowCount(0);
		
		Object[][] data = new Object[rn][2];
		for(int i =0;i<rn;i++){
			data[rn][0] = er.getExcelData(0, rn,0);
					data[rn][1]=er.getExcelData(0, rn, 1) ;
		}
		return data;
	}
	
	
}
