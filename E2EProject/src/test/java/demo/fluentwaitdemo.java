package demo;



import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;




public class fluentwaitdemo {

	 private static WebElement element;
	 public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		test();
	
	}
	
	public static  void test() throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\JAVALEARN\\filewriting\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.xpath("//h3[contains(text(),'Automation Testing Tutorial | How to Automate Soft')]")).click();
		   
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(5, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.id("foo"));
		     }
		   });
				   
		
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
		
		
		
		 
		
		
	}
}
