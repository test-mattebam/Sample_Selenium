package com.wbsystique.springboot.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assume.assumeFalse;

import java.util.List;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserUpdationSteps {
	/*FirefoxDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.facebook.com");
	}

	@Given("^User Registration application$")
	public void i_have_user_registration_form() throws Throwable {
		assertNotNull(driver);
	}

	@When("^user enters Name as \"([^\"]*)\" and age as (\\d+) and salary (\\d+)$")
	public void details1(String name, int age, int sal) {
		pauseUserInput();
		driver.findElement(By.id("uname")).sendKeys(name);
		pauseUserInput();
		driver.findElement(By.id("age")).sendKeys(Integer.toString(age));
    	pauseUserInput();
		driver.findElement(By.id("salary")).sendKeys(Integer.toString(sal));
		pauseUserInput();
		WebElement clickNextButton = driver.findElement(By.id("addOrUpdate"));
		clickNextButton.click();
		pauseUserInput();
	}

	@Then("^the result should be \"([^\"]*)\"$")
	public void the_result_should_be(String result) throws Throwable {

    	WebElement element = driver.findElement(By.className("alert"));
    	assertEquals(element.getText(), result);   		
		pauseUserInput();
	}
	
	@Then("^user count should be (\\d+)$")
	public void the_result_should_be(int  count) throws Throwable {
	
		WebElement Webtable=driver.findElement(By.id("usersList"));
		
		List<WebElement> tableRows=Webtable.findElements(By.xpath("//*[@id='usersList']/tbody/tr"));
		assertEquals(count, tableRows.size());
	
		pauseUserInput();
	}
	
	@Then("^delete all inserted users$")
	public void delete_all_users() throws Throwable {
		
		WebElement Webtable=driver.findElement(By.id("usersList"));
		List<WebElement> tableRows=Webtable.findElements(By.xpath("//*[@id='usersList']/tbody/tr"));
		
		for(int i=0; i<tableRows.size(); i++)
		{
		    	WebElement clickNextButton = driver.findElement(By.id("remove"));
		        clickNextButton.click();
		        pauseUserInput();
		 }
	}
		@Then("^user count should be (\\d+)$")
		public void the_result_should_be(int count) throws Throwable {
	
			
			WebElement Webtable=driver.findElement(By.id("usersList"));
			
			List<WebElement> tableRows=Webtable.findElements(By.xpath("//*[@id='usersList']/tbody/tr"));
			assertEquals(count, tableRows.size());
		
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
*/
}
