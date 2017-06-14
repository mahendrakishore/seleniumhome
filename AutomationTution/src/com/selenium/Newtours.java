package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.lib.Config;
import com.lib.DropDown;
import com.lib.RadioButton;

public class Newtours {

	WebDriver driver ;
	@Test
	public void test1() {
		// TODO Auto-generated method stub
		Config config = new Config("./src/com/config/Config.properties");
		System.setProperty("webdriver.chrome.driver", config.chrome());
		 driver = new ChromeDriver();
		driver.navigate().refresh();
		driver.get(config.url());
		driver.findElement(By.name("userName")).sendKeys("batman");
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("")).click();
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("")).sendKeys("");
		RadioButton.clickRadioButton(driver, "", "");
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("")).sendKeys("");
		DropDown.selecDropDown(driver, "", "");
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("")).click();
	}

}
