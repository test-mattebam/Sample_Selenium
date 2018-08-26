package com.websystique.springboot.testNg;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJUnit {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nmatt\\OneDrive\\Documents\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
	}


	@Test
	public void testEmail() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement emailElement = driver.findElement(By.cssSelector("input#email"));
		String emailInput = emailElement.getTagName();
		assertEquals("input", emailInput);
		
	}
	
	@Test
	public void testPassword() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement emailElement = driver.findElement(By.cssSelector("input#pass"));
		String emailInput = emailElement.getTagName();
		assertEquals("input", emailInput);
	}
	
	@Test
	public void testLogin() {
		
	}
	
	@Test
	public void testLink() {
		
	}
	
	
	@After
	public void tearDown() throws Exception {
	}
	
	
	
	

}
