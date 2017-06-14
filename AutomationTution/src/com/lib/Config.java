package com.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Config {
	 Properties properties ;
	public  Config(String path){		
		try{File file  = new File(path); //./src/com/config/Config.properties
		FileInputStream fis = new FileInputStream(file);
		 properties = new Properties();
		properties.load(fis);
		}
	catch(Exception e){
		System.out.println("config file exception");
	}}

	public  String firefox(){
	String path =	properties.getProperty("FirefoxDriver");
		return path;
	}
	
	public String chrome(){
		String path = properties.getProperty("ChromeDriver");
		return path;
	}
	
	public  String ie(){
		String path = properties.getProperty("IEDriver");
		return path;
	}
	
	public  String url(){
		String url = properties.getProperty("Url");
		return url ;
	}
	
	public String excel(){
		String excelpath = properties.getProperty("Excelpath");
		return excelpath;
	}
}
