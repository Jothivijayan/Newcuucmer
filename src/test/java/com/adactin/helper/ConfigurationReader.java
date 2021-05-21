package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;
	 public ConfigurationReader() throws IOException 
	 
	 //we are converting .properties into file
	 
	{
		 File f=new File("C:\\Users\\vjoth\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\adactin\\properties\\configuration.properties");
		 
		 FileInputStream fis=new FileInputStream(f);
		 
		 p= new Properties();
		 p.load(fis);
	}
	 public String getBrowser() {
		 
		 String browser = p.getProperty("browserName");
		 return browser;
		

	}
	 
	 public String getUrl() {
		String url = p.getProperty("url");
		return url;

	}
	 
}
