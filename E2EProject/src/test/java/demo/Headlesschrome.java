package demo;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;




public class Headlesschrome {

	static WebElement element;
	public static WebDriver driver;
	static FirefoxOptions headless;
	public static void main(String[] args) throws InterruptedException {

		test();

	}

	public static  void test() throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver", "C:\\JAVALEARN\\filewriting\\geckodriver.exe");
		
		
		headless =new FirefoxOptions();
		headless.addArguments("--headless");
		headless.addArguments("Window-size=1200,80");
		
		driver = new FirefoxDriver(headless);

		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		

	}
}
