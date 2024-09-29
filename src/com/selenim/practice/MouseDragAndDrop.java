package com.selenim.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		WebElement item1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement item2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		WebElement target= driver.findElement(By.id("trash"));
		
		Actions action2 = new Actions(driver);
		
		action2.dragAndDrop(item1, target).dragAndDrop(item2, target).perform();
		
		
		
	}

}
