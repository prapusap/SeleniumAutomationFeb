package handleFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleModalExample  {
	

	WebDriver driver;
	
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("http://www.uitestpractice.com/Students/Switchto");
		
		//driver.manage().window().maximize();
		
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
		
//		WebDriverWait wait = new WebDriverWait(driver, 120);			//maximum ---- before throwing an exception
//		wait.until(ExpectedConditions.alertIsPresent());

		
		WebElement btnModal =driver.findElement(By.cssSelector("[data-target='#myModal']"));
	
	
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		//JS.executeScript("alert('hello everyone, welcome you all in today session')");
		
		JS.executeScript("arguments[0].click()", btnModal);
		
		
		
		//modal ----- using switchTo
		
		//alert/frame/window
		
		//Thread.sleep(3000);
		
		
		WebDriverWait wait = new WebDriverWait(driver, 120);			//maximum ---- before throwing an exception
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-title")));
		
		//perform action on modal
		
		System.out.println("Modal heading :  " + driver.findElement(By.cssSelector(".modal-title")).getText());
		
		System.out.println("Modal body :  " + driver.findElement(By.cssSelector(".modal-body")).getText());
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		
		
	}
	

}
