package com.selenim.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://staging.engineer.ai/home");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Choose a base']")).click();
		driver.findElement(By.cssSelector("div[class='closeButton']")).click();
		
		 
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//div[@class='natashaMsgPanel']"));
		action.moveToElement(element).build().perform();
		//WebElement element2 = driver.findElement(By.xpath("//div[@class='closePanel']"));
	//	action.click(element2).build().perform();
		driver.findElement(By.xpath("//div[@class='closePanel']")).click();
		driver.findElement(By.xpath("(//button[@class='morebtn'])[1]")).click();
		driver.findElement(By.cssSelector("div[class='getStart']")).click();
		driver.findElement(By.name("signup_email")).sendKeys("sathyareddy@");//invalid email
		driver.findElement(By.name("firstlastname")).sendKeys("sathya");
		System.out.println(driver.findElement(By.xpath("//div[@class='errorMsg show']")).getText());//error msg
		driver.findElement(By.name("signup_email")).clear();
		driver.findElement(By.name("signup_email")).sendKeys("sathyareddy@gmail.com");//valid email
		driver.findElement(By.name("firstlastname")).clear();
		driver.findElement(By.name("firstlastname")).sendKeys("Reddy");
		driver.findElement(By.xpath("//div[@class='countryFlagCode']")).click();
		//driver.findElement(By.id("hiddenInputBox")).sendKeys("us");
		Thread.sleep(2000);
		
		List<WebElement> country =driver.findElements(By.xpath("//span[@class='countryCode']"));
		
		/*for(int i=0;i<country.size();i++)
		{
			System.out.println( country.get(i).getText());
		}
		
		for(int i=0;i<country.size();i++)
		{
			if(country.get(i).getText().equalsIgnoreCase("+43"))
			{
				country.get(i).click();
				break;
			}
		}*/
		
		for(WebElement option :country)
		{
			
			if (option.getText().equalsIgnoreCase("+971"))
			{
				option.click();
				
				break;
				
			}
			
		}
		
		
		driver.findElement(By.name("mobileNumber")).sendKeys("12325467");
		driver.findElement(By.xpath("//input[@class='form-control ng-dirty ng-touched ng-invalid']")).click();
	}
	}


