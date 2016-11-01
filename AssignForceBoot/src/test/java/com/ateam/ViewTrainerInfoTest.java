package com.ateam;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.ateam.connection.Conn;

import org.testng.annotations.BeforeClass;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ViewTrainerInfoTest {
	
  @Test
  public void viewTrainerInfo() {
	  WebDriver chrome = Conn.getDriver();
	  chrome.get("http://localhost:8081/");
	  chrome.manage().window().maximize();
	  
	  chrome.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a")).click();
	  try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	chrome.
	findElement(By.xpath("//*[@id=\"viewTrainerContainer\"]/article[1]/header/h3")).click();
	
	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	 chrome.quit();
	 
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
