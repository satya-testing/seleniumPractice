package com.selenim.practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipcart {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions action = new Actions(driver);
	//	WebElement element = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		WebElement element = driver.findElement(By.cssSelector("img[alt='Fashion']"));
		WebElement element2 = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		action.moveToElement(element).perform();
		action.moveToElement(element2).perform();
		
		
		
//		WebElement element2 = driver.findElement(By.xpath("(//div[@class='_3XS_gI _7qr1OC']) //a[@class='_6WOcW9 _2-k99T']"));
//		action.moveToElement(element2).build().perform();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[2]")).click();


		
    	
	}

}
