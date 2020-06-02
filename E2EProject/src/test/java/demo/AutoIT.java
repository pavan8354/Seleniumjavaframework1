package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		test();
	}
		
	public static  void test() throws IOException, InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\JAVALEARN\\filewriting\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		driver.findElement(By.xpath("//span[contains(text(),'Select PDF file')]")).click();
		
		Runtime.getRuntime().exec("D:\\fileuploadscript.exe");
		
		Thread.sleep(3000);
		
		
		
		
		 
		
		
	}
}
