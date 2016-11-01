package com.ateam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ateam.connection.Conn;

public class BatchTest {
  @Test
  public void createBatchTest() {
	  WebDriver chrome = Conn.getDriver();
	  chrome.get("http://localhost:8081/");
	  chrome.manage().window().maximize();
	  
	  chrome.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a")).click();
	  
	  WebElement batchName = chrome.findElement(By.xpath("//*[@id=\"bName\"]"));
	  batchName.sendKeys("16-Oct-Java-Steven");
	  
	  //Topic
	  WebElement topics = chrome.findElement(By.id("topicSelect"));
	  Select topicSelect = new Select(topics);
	  topicSelect.selectByValue("Java");
	  
	  //Curriculum
	  WebElement curr = chrome.findElement(By.id("curriculumSelect"));
	  Select currSelect = new Select(curr);
	  currSelect.selectByValue("Java");
	  
	  //Trainer
	  WebElement trainer = chrome.findElement(By.id("trainerSelect"));
	  Select trainerSelect = new Select(trainer);
	  trainerSelect.selectByValue("Steven");
	  
	  //Room
	  WebElement room = chrome.findElement(By.id("roomSelect"));
	  Select roomSelect = new Select(room);
	  roomSelect.selectByValue("204");
	  
	  //Submit
	  chrome.findElement(By.xpath("/html/body/div[2]/article/form/div/div[7]/input")).click();
	  
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
