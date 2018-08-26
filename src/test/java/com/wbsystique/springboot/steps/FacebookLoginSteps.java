/*package com.wbsystique.springboot.steps;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLoginSteps {
	FirefoxDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.facebook.com");
	}

	@Given("^facebook registration details$")
	public void i_have_facebook_registration_form() throws Throwable {
		assertNotNull(driver);
	}

	@When("^user enters email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void details1(String email, String password) {
		
		pauseUserInput();
		driver.findElement(By.id("email")).sendKeys(email);
		pauseUserInput();
		driver.findElement(By.id("pass")).sendKeys(password);
    	pauseUserInput();
    	WebElement clickNextButton = driver.findElement(By.xpath("//*[@id='loginbutton']"));

		clickNextButton.click();
		pauseUserInput();
	}

		@Then("^result should be \"([^\"]*)\"$")
		public void the_result_should_be(String result) throws Throwable {

	 	//WebElement element = driver.findElement(By.className("linkWrap noCount"));
         String actualTitle = driver.getTitle();
			 
    	assertEquals(result, actualTitle);   		
		pauseUserInput();
	}

		@After
		public void destory() {
			driver.close();

		}

		private void pauseUserInput() {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}

	}*/