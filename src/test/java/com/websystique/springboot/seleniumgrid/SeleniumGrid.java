package com.websystique.springboot.seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test.*;

public class SeleniumGrid {
	
	WebDriver driver;

	@BeforeTest
    public void setUp() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nmatt\\OneDrive\\Documents\\driver\\chromedriver.exe");
		
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.WIN10);	   
        driver = new RemoteWebDriver(new URL(" http://192.168.0.26:4444/wd/hub"), capability);
       // driver.navigate().to("http://www.facebook.com");
    }
	
	

    @Test
    public void sampleTest() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 driver.get("http://www.facebook.com");
    	 
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.findElement(By.cssSelector("input#email")).sendKeys("vasudhamattebam@gmail.com");
		 driver.findElement(By.cssSelector("input#pass")).sendKeys("Whoamil@123");
		 driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
    	
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	
    
	@AfterTest
    public void afterTest() {
        driver.quit();
    }
	
	
}
