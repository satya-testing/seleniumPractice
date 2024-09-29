package com.selenim.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> dropDown= driver.findElements(By.xpath("//li[@class='sbct']"));
		
//		//for (int i=0;i<dropDown.size();i++)
//		{
//			System.out.println(dropDown.get(i).getText());
//			
//		}
		for (int i=0; i<dropDown.size();i++) {
			if(dropDown.get(i).getText().equalsIgnoreCase("selenium testing"))
			{
				dropDown.get(i).click();
				break;
			}
		}
		

}
}
