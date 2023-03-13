package sync_conditionalExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class HandleAlertExample  {
	

	WebDriver driver;
	ReadConfig conf;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		conf = new ReadConfig();
		//driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		
		//http://only-testing-blog.blogspot.com/2013/11/new-test.html
		driver.get("http://only-testing-blog.blogspot.com/2014/01/new-testing.html?");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //  
		//application - for any element
		//network/application slow
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
		
		//Thread.sleep(20000); //hard coded delay ----- 20 sec
		
		
		//conditional Wait
		//specific to a condition
		//Scenario ---- specific condition
		
		
		WebDriverWait wait = new WebDriverWait(driver, 120);			//maximum ---- before throwing an exception
		wait.until(ExpectedConditions.alertIsPresent());
//		
//		
		
		//driver.findElement(By.cssSelector("input[id='text3']")).sendKeys("enter your name !!");
	
	
		System.out.println(driver.switchTo().alert().getText());
		
		//Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		
		
		
		
	}
	

}
