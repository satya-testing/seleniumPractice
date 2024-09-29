package com.selenim.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6)); //implicit wait for the step where output is not coming
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("menu-toggle")).click();
		driver.findElement(By.cssSelector("a[href='profile.php#login']")).click();
		
		driver.findElement(By.id("txt-username")).sendKeys("sathya");
		driver.findElement(By.id("txt-password")).sendKeys("123456789");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		String s1=driver.findElement(By.cssSelector("p.lead.text-danger")).getText();
		System.out.println(s1);
		
		 driver.findElement(By.cssSelector("input[placeholder='Username'][value='John Doe']")).click();
		 driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		 driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 
		//String s=driver.findElement(By.cssSelector("input[placeholder='Username'][value='John Doe']")).getText();
		//System.out.println(s);
		//driver.findElement(By.id("txt-username")).sendKeys(s);
	}

}
	