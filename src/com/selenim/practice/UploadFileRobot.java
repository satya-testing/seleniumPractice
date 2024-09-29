package com.selenim.practice;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileRobot {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");		
		driver.findElement(By.id("register_Layer")).click();
		//driver.findElement(By.id("file-upload")).sendKeys("C:/Users/HP/Downloads/202225.pdf");
		driver.findElement(By.xpath("//button[normalize-space()='Upload Resume']")).click();
		
		Robot rb = new Robot();
		rb.delay(3000);
		//1. copy path to the clipboard
		//2. paste ctrl+v
		//3. enter
		
		StringSelection ss = new StringSelection("C:\\Users\\HP\\OneDrive\\Documents\\Satya_Testing.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
