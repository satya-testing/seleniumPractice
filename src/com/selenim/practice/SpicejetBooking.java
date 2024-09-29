package com.selenim.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpicejetBooking {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		 WebElement ele=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		 
		 Select currency = new Select(ele);
		 currency.selectByValue("USD");
		  System.out.println(currency.getFirstSelectedOption().getText());
		  
		  Thread.sleep(2000);
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 driver.findElement(By.xpath("//a[@value='IXL']")).click();
		 driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();		 
		 driver.findElement(By.id("autosuggest")).sendKeys("ind");
		 
	}

}
