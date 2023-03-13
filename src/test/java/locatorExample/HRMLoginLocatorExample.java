package locatorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;

public class HRMLoginLocatorExample {
	
	WebDriver wd;
	
	@Test
	public void verifyLoginFeatureWithValidCredenatils(){
		
		
		//wd.findElement(By.id(""));
		
		//locator - name
		
		
		WebElement txtUserName = wd.findElement(By.name("username"));
		txtUserName.sendKeys("ibm user name");
		
	}
	
	
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		System.out.println("closinging application");
		Thread.sleep(5000);
		wd.close();
	}
	
	@BeforeTest
	public void launchApp() throws InterruptedException {
		
		System.out.println("launching application------testNG");
		
		wd = WebDriverManager.chromedriver().create();
		
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(4000);
		
	}

}
