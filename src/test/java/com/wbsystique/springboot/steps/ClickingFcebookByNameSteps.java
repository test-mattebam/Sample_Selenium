package com.wbsystique.springboot.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.interactions.Actions;
                                                               
public class ClickingFcebookByNameSteps {
	WebDriver driver;
	 Actions actions ;
	 @Before
	 public void setUp() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmatt\\OneDrive\\Documents\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		  actions =new Actions(driver);
		driver.navigate().to("http://www.facebook.com");
}
	 @Given("^Facebook details$")
		public void i_have_facebook_details() throws Throwable {
			//assertNotNull(driver);
}
	 @When("^user enters emailId as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	 public void details1(String email,String password) {
/*	 driver.findElement(By.cssSelector("input#email")).sendKeys(email);
	 driver.findElement(By.cssSelector("input#pass")).sendKeys(password);
	driver.findElement(By.id("loginbutton")).click();*/
		
		 }
	 @Then("^the result should be \"([^\"]*)\"$")
		
	 public void the_result_should_be(String result) throws Throwable {
		 pauseUserInput();
		 
		 WebElement element =  driver.findElement(By.xpath("//*[@id=\"birthday-help\"]"));

		 actions.moveToElement(element).build().perform();
		 WebElement datapolicy = driver.findElement(By.id(("privacy-link")));
		 assertEquals("Data Policy", datapolicy.getText());
		 
		  
		 
		 

	 }
	 private void pauseUserInput() {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {

			}
	 }
		}
	 
	 
	 
	 
	 
	 
	 