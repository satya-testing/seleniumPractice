package com.selenim.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging.engineer.ai/home");
		driver.findElement(By.xpath("//button[text()='Choose a base']")).click();
		driver.findElement(By.cssSelector("div[class='closeButton']")).click();


		Actions action = new Actions(driver);
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//div[@class='natashaMsgPanel']"));
		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//div[@class='closePanel']")).click();
		driver.findElement(By.xpath("//div[@class='currencySelBox']//span[@class='sel_state']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='currencySelBox']")).click();
		//Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='currencySelBox']//span[@class='currencyName'][normalize-space()='Euro']")).click();

		driver.findElement(By.xpath("//span[normalize-space()='Education']")).click();




		//		List<WebElement> currency = driver.findElements(By.xpath("//div[@class='currencychoose']"));
		//		for(int i=0;i<currency.size();i++)
		//		{
		//			System.out.println(currency);
		//		if(currency.get(i).getText().equalsIgnoreCase("Euro"))
		//		{
		//			System.out.println("hi");
		//			currency.get(i).click();
		//			break;
		//			}
	}


}


