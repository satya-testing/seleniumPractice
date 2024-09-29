package com.selenim.practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.zeromq.ZStar.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//explicit wait
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
//		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
//		ele.sendKeys("Admin");
//		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		System.out.println("Title of the page is "+ driver.getTitle());
//		System.out.println("Current page URL is "+ driver.getCurrentUrl());
//		//System.out.println("page source code is "+ driver.getPageSource());
//		System.out.println("page id is "+ driver.getWindowHandle());
//		
//		java.util.Set<String> allitems = driver.getWindowHandles();
//		for(String items:allitems) {
//			System.out.println(items);
		
		driver.get("https://practice.automationtesting.in/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		//WebElement eWait = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@title='Thinking in HTML")));
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshotsj\\facebook.png");
		
		FileUtils.copyFile(src, trg);
			
		WebElement ele= driver.findElement(By.xpath("//img[@title='Thinking in HTML']"));
		
		File src1 = ele.getScreenshotAs(OutputType.FILE);
		File trg2 = new File("C:\\Users\\HP\\\\OneDrive\\Pictures\\Screenshotsj\\Thinking.png");
		FileUtils.copyFile(src1, trg2);
		
		
			
		}
			
	}


