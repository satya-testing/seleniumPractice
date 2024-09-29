package com.selenim.practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com");
		
//				How to capture Screenshot of Full Page?
//				How to capture Screenshot of Section of Page?
//				How to capture Screenshot of Element on a Page?
		
//		1.Type cast TakesScreenshot interface,type casting is not required if ChromeDriver driver interface is implemented instead of WebDriver Driver.
//		2.source File type.
//		3.Target file Path to save the SS
//		4.Copy file (src, trg)

		
		TakesScreenshot ts = (TakesScreenshot) driver;
//take screenshot of full page
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshotsj\\facebook.png");
		FileUtils.copyFile(src, trg);
		System.out.println("SS taken");

//		Take screenshot for a section/portion of the page
		driver.get("https://www.walmart.com/");
		WebElement section = driver.findElement(By.xpath("//body/div[@id='__next']/div/div[@class='flex flex-column min-vh-100 shadow-2']/div[@class='flex flex-column flex-auto relative z-0']/div[@class='flex-auto relative z-1 bg-blue-10']/div[@id='maincontent']/main[@id='maincontent']/div[@class='flex flex-column h-100']/div[@class='h-100 relative']/div[@class='w_Dl w_Dm flex-row']/div[3]"));
		
		File src2 = section.getScreenshotAs(OutputType.FILE);
		File trg2= new File("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshotsj\\walmart.png");		
		FileUtils.copyFile(src2, trg2);
		System.out.println("SS2 taken");
//	take screenshot of a web element (same as section of the page ss)

	}

}
