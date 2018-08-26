package com.websystique.springboot.testNg;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG1 {

	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nmatt\\OneDrive\\Documents\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
	}

	
	//  Reading from parametes in TestNg suite (testing.xml)

/*	@Parameters({"username","password"})
	@Test(priority=0)
	public void testLoginParameters(String userName, String password) {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.findElement(By.cssSelector("input#email")).sendKeys(userName);
		 driver.findElement(By.cssSelector("input#pass")).sendKeys(password);
		 driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/
	
//  Reading from parametes in DataProvider class
	@Test(dataProvider="getDataFromDataprovider", dataProviderClass=DataproviderClass.class, priority=0)
	public void testLoginDataProvider(String username, String password) {
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 driver.findElement(By.cssSelector("input#email")).sendKeys(username);
		 driver.findElement(By.cssSelector("input#pass")).sendKeys(password);
		 driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
  
	
	
	
	//@Test(priority=1)
	public void testClickButton() {
		
	}
	
//	@Test(priority=2)
	public void testClosePopup() {
	}
	
	@Test
	public void testLink() {
		   
   }

	
	
	@AfterTest
	public void tearDown() throws Exception {
		driver.close();
	
	}

}
