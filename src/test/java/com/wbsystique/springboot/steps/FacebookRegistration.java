/*package com.wbsystique.springboot.steps;

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

public class FacebookRegistration {
	
	WebDriver driver;
	
	
 @Before
 public void setUp() {
	 
	//driver = new FirefoxDriver();
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmatt\\OneDrive\\Documents\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://www.facebook.com");
}
 @Given("^facebook registration details$")
	public void i_have_facebook_registration_form() throws Throwable {
		//assertNotNull(driver);
	}
 
 @When("^user enters Firstname as \"([^\"]*)\" and Surname as \"([^\"]*)\" and email1 as \"([^\"]*)\" and Email2 as \"([^\"]*)\" and Password as \"([^\"]*)\" and day as (\\d+) and month as (\\d+) and year as (\\d+)$")
 public void details1(String Firstname, String Surname, String EmailId,String EmailId2, String Password, int day,int month,int year) {
	 pauseUserInput();
	 

		driver.findElement(By.xpath("//*[@id=\"u_0_l\"]")).sendKeys(Firstname);
	//	pauseUserInput();
		driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys(Surname);
 	// // pauseUserInput();
 	driver.findElement(By.xpath("//*[@id=\"u_0_q\"]")).sendKeys(EmailId);
	// pauseUserInput();
	driver.findElement(By.xpath("//*[@id=\"u_0_t\"]")).sendKeys(EmailId2);
	// pauseUserInput();
	driver.findElement(By.xpath("//*[@id=\"u_0_x\"]")).sendKeys(Password);
	// pauseUserInput();
	
	Select birthDay = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[6]/div[2]/span/span/select[1]/option[12]")));
	Select birthMonth = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[6]/div[2]/span/span/select[2]/option[8]")));
	Select birthYear = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[6]/div[2]/span/span/select[3]/option[29]")));
	
	birthDay.selectByValue(Integer.toString(day));
	birthMonth.selectByValue(Integer.toString(month));
	birthYear.selectByValue(Integer.toString(year));	
	// pauseUserInput();
	WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"u_0_a\"]"));
	radioButton.click();
	pauseUserInput();
	WebElement clickNextButton1 = driver.findElement(By.xpath("//*[@id=\"u_0_11\"]"));
 	clickNextButton1.click();
	
	
 }
 @Then("^the result should be \"([^\"]*)\"$")
	public void the_result_should_be(String result) throws Throwable {

	WebElement clickNextButton = driver.findElement(By.xpath("//*[@id=\"u_0_j\"]"));
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

}
*/