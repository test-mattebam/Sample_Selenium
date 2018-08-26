/*package com.wbsystique.springboot.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ClickingGuru99Steps {
	
	WebDriver driver;
	 @Before
	 public void setUp() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmatt\\OneDrive\\Documents\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.navigate().to("http://www.guru99.com");
}
	 @Given("^Guru99 details$")
		public void i_have_guru99_details() throws Throwable {
			//assertNotNull(driver);
}
	 @When("^user clicks Link as \"([^\"]*)\"$")
	 public void details1(String testing) {
	 driver.findElement(By.xpath("//*[@id=\"maximenuck243\"]/div[2]/ul/li[3]/a")).click();
	 driver.findElement(By.xpath("//*[@id=\"maximenuck243\"]/div[5]/div[1]/div/div[2]/ul/li[1]/a")).click();
	 }
	 @Then("^the result should be \"([^\"]*)\"$")
		
	 public void the_result_should_be(String result) throws Throwable {
		
	   WebElement clickNextButton = driver.findElement(By.xpath("//*[@id=\"g-mainbar\"]/div/div/div/div/div/div/div[1]/h1"));
	    
	 }
	 @After
		public void destory() {
			driver.close();
}
	 
}*/	 
	 
	 
	 
	 
	 
	 