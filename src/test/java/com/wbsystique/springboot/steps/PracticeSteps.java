package com.wbsystique.springboot.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PracticeSteps {
  WebDriver driver;
  Actions actions;	
 @Before
	public void setUp() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmatt\\OneDrive\\Documents\\driver\\chromedriver.exe");
     driver = new ChromeDriver();
     actions = new Actions(driver);
 driver.navigate().to("http://www.facebook.com");
 }
 @Given("^Facebook details$")
 public void i_have_facebook_details() {
 assertNotNull(driver);
  }
@When("^user enters emailId as \"([^\"]*)\" and password as \"([^\"]*)\"$") 	
	public void userDetails(String email, String password) {
	driver.findElement(By.cssSelector("input#email")).sendKeys(email);
    driver.findElement(By.id("pass")).sendKeys(password);
}
@Then("^the result should be \"([^\"]*)\"$")
	public void result(String result) {
	WebElement element = driver.findElement(By.id("email"));
	actions.click(element).build().perform();
	assertEquals(element, element.getText());
	
	
}
	
	
}
