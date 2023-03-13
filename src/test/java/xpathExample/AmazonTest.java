package xpathExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	
	
WebDriver driver;
	
	@BeforeTest
	public void setup() throws Exception {
		
		System.out.println("launching app");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	

	
	@AfterTest
	public void teardown() throws Exception {
		
		System.out.println("closing app");
		Thread.sleep(5000);
		driver.close();
		
	}
	
	@Test
	public void serachItems() throws Exception {
		
		
		//driver.findElement(By.xpath("//h2[contains(text(),'Up to 70% off | Clearance store')]//parent::div//following-sibling::div[contains(@class,'foot')]//child::a[text()='See more']")).click();
		
		
		driver.findElement(By.xpath("//h2[contains(text(),'Automotive essentials')]//parent::div//following-sibling::div[contains(@class,'foot')]//child::a[text()='See more']")).click();
		
		
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().contains("Car &"));
		System.out.println(driver.getTitle());
		
	}

}
