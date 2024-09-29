package com.selenim.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleSelectDropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		WebElement birthday=driver.findElement(By.name("birthday_day"));
		selectOptions(birthday,"27");
		WebElement birthMonth=driver.findElement(By.name("birthday_month"));
		selectOptions(birthMonth,"Jul");
		WebElement birthYear=driver.findElement(By.name("birthday_year"));
		selectOptions(birthYear,"1995");
	}



public static void selectOptions(WebElement ele, String value)
{
Select drp = new Select(ele);
List<WebElement>allOptions=drp.getOptions();
for(WebElement option:allOptions) {
	if(option.getText().equals(value)) {
		option.click();
		break;
	}
}
}
}