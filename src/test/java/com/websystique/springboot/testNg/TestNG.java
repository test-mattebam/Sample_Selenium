package com.websystique.springboot.testNg;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class TestNG {

	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nmatt\\OneDrive\\Documents\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
	}

	
	//  Reading from parametes in TestNg suite (testing.xml)

/*	@Parameters({"username","password"})
	@Test(priority=0)
	public void testLoginParameters(String userName, String password) {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.findElement(By.cssSelector("input#email")).sendKeys(userName);
		 driver.findElement(By.cssSelector("input#pass")).sendKeys(password);
		 driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/
	
//  Reading from parametes in DataProvider class
/*	@Test(dataProvider="DatabaseProvider", dataProviderClass=DataproviderClass.class, priority=0)
	public void testLoginDataProvider(String userName, String password) {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.findElement(By.cssSelector("input#email")).sendKeys(userName);
		 driver.findElement(By.cssSelector("input#pass")).sendKeys(password);
		 driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/
	
  // Reading from excel sheet
	@Test
	public void testLoginReadingFromExcel() {
		 String userName = null;
		 String password =  null;
		 
		File file =    new File("C:\\Users\\nmatt\\OneDrive\\Documents\\userCredentials.xls");	
		try {
			FileInputStream inputStream = new FileInputStream(file);
			HSSFWorkbook userCredentialsWorkbook = new HSSFWorkbook(inputStream);
			Sheet userCredentialsSheet = userCredentialsWorkbook.getSheet("userCredentials");
			 int rowCount = userCredentialsSheet.getLastRowNum()-userCredentialsSheet.getFirstRowNum();
			
			 for (int j = 0; j < rowCount; j++) {

				 Row row = userCredentialsSheet.getRow(j+1);
				  
				Cell usernameCell =  row.getCell(0) ;
				Cell passwordCell =  row.getCell(1) ;
	
				
				
				 userName = usernameCell.getStringCellValue();
				 password = passwordCell.getStringCellValue();
				

		        }
			 
			
		} catch (IOException e) {

		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.findElement(By.cssSelector("input#email")).sendKeys(userName);
		 driver.findElement(By.cssSelector("input#pass")).sendKeys(password);
		 driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	//@Test(priority=1)
	public void testClickButton() {
		
	}
	
//	@Test(priority=2)
	public void testClosePopup() {
	}
	
	@Test
	public void testLink() {
		   
   }

	
	
	@AfterTest
	public void tearDown() throws Exception {
		driver.close();
	
	}

}
