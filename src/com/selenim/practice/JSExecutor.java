package com.selenim.practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('email').value='satya'");
		
//		jse.executeScript("document.getElementById('email').style.border='5px red solid'");
//		
//		jse.executeScript("document.getElementById('email').style.background='yellow'");
		Thread.sleep(3000);
		
//		jse.executeScript("document.getElementById('email').setAttribute(‘style’,’border:2px red solid;background:green’)");
		jse.executeScript("document.getElementById('email').setAttribute(‘style’,’border:2px red solid;background:green’)");
		Thread.sleep(3000);
		jse.executeScript("document.getElementsByName('login')[0].click()");
		
//jse.executeScript("window.scrollTo(0,500)	");	
//jse.executeScript("window.scrollBy(0,500)	");		
//jse.executeScript(" document.getElementsByClassName('-link js-gps-track')[22].scrollIntoView();");	
		
		//using selenium locator
	//	WebElement username = driver.findElement(by.id("email"));
	//	jse.executeScript(arguments[0].setAttribute(‘style’,’border:2px blue solid;background:yellow’), username);
		

	}

}
