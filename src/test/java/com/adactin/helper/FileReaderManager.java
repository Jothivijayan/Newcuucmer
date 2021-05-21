package com.adactin.helper;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager()
	{
		
	}
	
	public static FileReaderManager getInstance() {
		FileReaderManager helper=new FileReaderManager();
		return helper; 
	}
	
	public ConfigurationReader getInstanceCR() throws Throwable {
		
		ConfigurationReader reader=new ConfigurationReader();
		return reader;
		
		

	}
	
}
