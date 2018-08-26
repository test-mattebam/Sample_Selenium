package com.wbsystique.springboot.steps;

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

public class UserRegistrationSteps {


	/*FirefoxDriver driver;
	
    @Before
    public void setUp() {
    	driver = new FirefoxDriver();
    	driver.navigate().to("http://localhost:8080/SpringBootCRUDApp"); 
    }
    
    @Given("^User Registration application$")
    public void i_have_user_registration_form() throws Throwable {
        assertNotNull(driver);
    }
   
    @When("^user enters Name as \"([^\"]*)\" and age as (\\d+) and salary (\\d+)$")
    public void I_Enters_Name_Age_salary(String name, int age, int sal) {
    	pauseUserInput();
    	driver.findElement(By.id("uname")).clear();
    	driver.findElement(By.id("uname")).sendKeys(name);
    	pauseUserInput();
    	driver.findElement(By.id("age")).clear();
    	driver.findElement(By.id("age")).sendKeys(Integer.toString(age));
    	pauseUserInput();
    	driver.findElement(By.id("salary")).clear();
    	driver.findElement(By.id("salary")).sendKeys(Integer.toString(sal));
    	pauseUserInput();
    	WebElement clickNextButton = driver.findElement(By.id("submit"));
       clickNextButton.click();
       pauseUserInput();
       
    } 
    
    @Then("^the result should be \"([^\"]*)\"$")    
    public void the_result_should_be(String result) throws Throwable {
    	WebElement element = driver.findElement(By.className("alert"));
    	assertEquals(element.getText(), result);   
    	pauseUserInput();
    }
    
    @Then("^Delete user$")
    public void deleteUser() throws Throwable {
    	WebElement clickNextButton = driver.findElement(By.id("remove"));
        clickNextButton.click(); 
    }
    
    
    @Then("^the result should be empty fields$")    
    public void the_result_should_be_empty() throws Throwable {

    	
    	String userName = driver.findElement(By.id("uname")).getText();
    	String age = driver.findElement(By.id("age")).getText();
    	String salary = driver.findElement(By.id("salary")).getText();
    	
    	assertEquals(userName, "");
    	assertEquals(age, "");
    	assertEquals(salary, "");
    }
    
    
    @When("^user clicks edit button$")
    public void user_clicks_edit_button() {
    	WebElement clickNextButton = driver.findElement(By.id("edit"));
       clickNextButton.click();
       pauseUserInput();
       
    } 
    
    @After
    public void destory() {
    	
    }
    
   private void pauseUserInput() {
	   try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {

	}
   }
 */
}
