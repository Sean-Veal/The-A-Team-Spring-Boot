package com.ateam.connection;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conn {

	
	public static WebDriver getDriver(){
File ieFile = new File("C:/selenium/chromedriver.exe");
	
	System.setProperty("webdriver.chrome.driver", ieFile.getAbsolutePath());
	return new ChromeDriver();
	}
}
