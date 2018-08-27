package com.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
public Properties prop;
	
	public TestBase(){
		prop = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream("C:/Users/suraj/workspace/RestAPIAutomation/src/main/java/com/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
			catch (IOException e) {
			e.printStackTrace();
		}
	}

}
