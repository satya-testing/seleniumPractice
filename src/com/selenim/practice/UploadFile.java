package com.selenim.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("register_Layer")).click();
		//driver.findElement(By.id("file-upload")).sendKeys("C:/Users/HP/Downloads/202225.pdf");
		driver.findElement(By.xpath("//button[normalize-space()='Upload Resume']")).click();
		
		Robot rob = new Robot();
		rob.delay(3000);
		
		//1.copy file path to the clipboard
		//2. ctrl+V
		//3. press Enter
		
		StringSelection ss = new StringSelection("C:\\Users\\HP\\OneDrive\\Documents\\Satya_Testing.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}

}
