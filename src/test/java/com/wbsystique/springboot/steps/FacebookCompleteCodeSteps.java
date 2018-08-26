/*package com.wbsystique.springboot.steps;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookCompleteCodeSteps {
	/*	FirefoxDriver driver;
 @Before
 public void setUp() {
	driver = new FirefoxDriver();
	driver.navigate().to("http://www.facebook.com");
}
 @Given("^facebook registration details$")
	public void i_have_facebook_registration_form() throws Throwable {
		assertNotNull(driver);
	}
 
 @When("^user enters Firstname as \"([^\"]*)\" and Surname as \"([^\"]*)\" and email1 as \"([^\"]*)\" and Email2 as \"([^\"]*)\" and Password as \"([^\"]*)\" and day as (\\d+) and month as (\\d+) and year as (\\d+)$")
 public void details1(String Firstname, String Surname, String EmailId,String EmailId2, String Password, int day,int month,int year) {
	 pauseUserInput();
		driver.findElement(By.id("u_0_l")).sendKeys(Firstname);
	//	pauseUserInput();
		driver.findElement(By.id("u_0_n")).sendKeys(Surname);
 	// // pauseUserInput();
 	driver.findElement(By.id("u_0_q")).sendKeys(EmailId);
	// pauseUserInput();
	driver.findElement(By.id("u_0_t")).sendKeys(EmailId2);
	// pauseUserInput();
	driver.findElement(By.id("u_0_x")).sendKeys(Password);
	// pauseUserInput();
	
	Select birthDay = new Select(driver.findElement(By.id("day")));
	Select birthMonth = new Select(driver.findElement(By.id("month")));
	Select birthYear = new Select(driver.findElement(By.id("year")));
	
	birthDay.selectByValue(Integer.toString(day));
	birthMonth.selectByValue(Integer.toString(month));
	birthYear.selectByValue(Integer.toString(year));	
	// pauseUserInput();
	WebElement radioButton = driver.findElement(By.id("u_0_9"));
	radioButton.click();
	pauseUserInput();
	WebElement clickNextButton1 = driver.findElementById("u_0_13");
 	clickNextButton1.click();
	
	
 }
 @Then("^the result should be \"([^\"]*)\"$")
	public void the_result_should_be(String result) throws Throwable {

	WebElement clickNextButton = driver.findElementById("u_0_c");
	clickNextButton.click();
	pauseUserInput();
 }
 @After
	public void destory() {
		driver.close();

	}

	private void pauseUserInput() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

		}
	}
	 */

