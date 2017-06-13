package com.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Config {
	static Properties properties ;
	 static{		
		try{File file  = new File("./src/com/config/Config.properties");
		FileInputStream fis = new FileInputStream(file);
		 properties = new Properties();
		properties.load(fis);
		}
	catch(Exception e){
		System.out.println("config file exception");
	}}

	public static String firefox(){
	String path =	properties.getProperty("FirefoxDriver");
		return path;
	}
	
	public static String chrome(){
		String path = properties.getProperty("ChromeDriver");
		return path;
	}
	
	public static String ie(){
		String path = properties.getProperty("IEDriver");
		return path;
	}
	
	public static String url(){
		String url = properties.getProperty("Url");
		return url ;
	}
}
