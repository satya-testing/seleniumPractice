import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy2 {

	public static void main(String[] args) throws Exception {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Assert.assertTrue(driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).isDisplayed());
			Thread.sleep(5000);
			driver.quit();
		}

}
