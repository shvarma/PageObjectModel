package com.helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityHelper {
	
	public String getString(String strKey, String PropFile) throws FileNotFoundException, IOException 
	{
		Properties prop = new Properties();
		prop.load(new FileInputStream(PropFile));
		String strData = prop.getProperty(strKey);
		return strData.trim();
	}
}
