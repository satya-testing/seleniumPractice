package com.selenim.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/");
		
		WebElement mainMenu =driver.findElement(By.xpath("(//a[@class='no_border'])[2]"));
		WebElement subMenu  =driver.findElement(By.id("menu-item-2823"));
		WebElement targetMenu =driver.findElement(By.id("menu-item-2829"));

		Actions action1 = new Actions(driver);
				
		action1
		.moveToElement(mainMenu)
		.moveToElement(subMenu)
		.moveToElement(targetMenu)
		.click().perform();

	}

}
