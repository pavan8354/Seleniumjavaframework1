package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Seleniumwaitdemo {

	 private static WebElement element;
	public static void main(String[] args) {
		
	seleniumwaits();
	}
	
	public static void seleniumwaits()
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\JAVALEARN\\filewriting\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		 driver.findElement(By.name("q")).sendKeys("Automation step by step");
		 driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		 
		 WebDriverWait wait =new WebDriverWait(driver,10);
		 
		 element = wait.until(ExpectedConditions.elementToBeClickable(By.id("abcdef")));
		 
		 driver.findElement(By.name("abcd")).click();
		 
		 driver.close();
		 driver.quit();
		
		
	}
}
