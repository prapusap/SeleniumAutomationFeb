package handleFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PayTM_FrameExample  {
	

	WebDriver driver;
	
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("https://paytm.com/");
		
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
		
		
		WebElement btnSignIn =driver.findElement(By.xpath("//span[contains(text(),'Sign')]"));
		
		//app1
		btnSignIn.click();
	
	
//		//app2
//		JavascriptExecutor JS = (JavascriptExecutor) driver;
//		JS.executeScript("arguments[0].scrollIntoView()", btnSignIn);
		
		
		//alert/frame/window ------- switchTo()
		//handle frame
		
		//index  ----- start from 0
		//name/id
		//WebElement
		
		//driver.switchTo().frame(0);
		
		//driver.switchTo().frame("name/id");
		
		//webElement --- using 
		WebElement myFrame = driver.findElement(By.cssSelector("iframe[src*='login?']"));
		
		driver.switchTo().frame(myFrame);
		
		
		
		String actualHeading = driver.findElement(By.cssSelector("p.heading")).getText();
		
		System.out.println("Heading: " + actualHeading);
		Assert.assertTrue(actualHeading.contains("Paytm Web account"));
		
		//click on Watch Video
		WebElement lnkWatchVideo =driver.findElement(By.xpath("//span[contains(text(),'Watch')]"));
		lnkWatchVideo.click();
		
	}
	

}
