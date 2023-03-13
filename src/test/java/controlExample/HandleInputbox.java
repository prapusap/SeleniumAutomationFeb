package controlExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class HandleInputbox extends BaseTest {
	
//	WebDriver driver;
//	ReadConfig conf;
//	
//	@Before
//	public void launchApp() throws Exception {
//		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		conf = new ReadConfig();
//		//driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
//		driver.get(conf.getSampleApplication());
//		
//		driver.manage().window().maximize();
//		
//	}
//	
//	
//	@After
//	public void closeApp() throws Exception {
//		
//		System.out.println("closing the application");
//		Thread.sleep(7000);
//		driver.close();
//		//driver.quit();
//		
//	}
	
	@Test
	public void verifyInput() {
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("enter first Name");
	}
	

}
