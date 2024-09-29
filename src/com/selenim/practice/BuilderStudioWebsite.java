package com.selenim.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BuilderStudioWebsite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://staging.engineer.ai/home");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Choose a base']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.cssSelector("div[class='closeButton']")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.cssSelector("div[class='closePanel']")).click();
		//driver.findElement(By.xpath("//div[@class='closePanel']")).click();
		 
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div[@class='natashaMsgPanel']"));
		action.moveToElement(element).build().perform();
		//WebElement element2 = driver.findElement(By.xpath("//div[@class='closePanel']"));
	//	action.click(element2).build().perform();
		driver.findElement(By.xpath("//div[@class='closePanel']")).click();
		
		driver.findElement(By.xpath("(//button[@class='morebtn'])[1]")).click();
		driver.findElement(By.cssSelector("div[class='getStart']")).click();
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		driver.findElement(By.id("loginEmailInput")).sendKeys("");
		
		//driver.findElement(By.id("loginEmailInput")).sendKeys("abc");

		driver.findElement(By.name("password")).sendKeys("");
		System.out.println(driver.findElement(By.xpath("//div[text()=' Email cannot be blank ']")).getText());
	//System.out.println(driver.findElement(By.xpath("//div[text()=' Please enter valid email ']")).getText());
	System.out.println();
		driver.findElement(By.id("loginEmailInput")).clear();
		driver.findElement(By.id("loginEmailInput")).sendKeys("abc@gamil.com");
		
//		driver.findElement(By.name("signup_email")).sendKeys("sathyareddy@");//invalid email
//		driver.findElement(By.name("firstlastname")).sendKeys("sathya");
//		System.out.println(driver.findElement(By.xpath("//div[@class='errorMsg show']")).getText());//error msg
//		driver.findElement(By.name("signup_email")).clear();
//		driver.findElement(By.name("signup_email")).sendKeys("sathyareddy@gmail.com");//valid email
//		driver.findElement(By.name("firstlastname")).clear();
//		driver.findElement(By.name("firstlastname")).sendKeys("Reddy");
//		driver.findElement(By.name("mobileNumber")).sendKeys("12325467");

		//Thread.sleep(3000);
		//driver.close();
	}

	
	
}
