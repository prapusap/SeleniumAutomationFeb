package javascriptExecutorExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraExample  {
	

	WebDriver driver;
	
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
		
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		System.out.println("closing the application");
		Thread.sleep(7000);
		driver.close();
		//driver.quit();
		
	}
	
	
	@Test
	public void verifyAlert() throws Exception {
		
		
		WebElement lblReturnPolicy =driver.findElement(By.xpath("//*[contains(text(),'within 30da')]"));
		
		WebElement lblReturnPolicy1 =driver.findElement(By.xpath("//strong[contains(text(),'within 30da')]"));
	
	
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		JS.executeScript("arguments[1].scrollIntoView()", lblReturnPolicy, lblReturnPolicy1);
		
	}
	

}
