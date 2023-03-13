package controlExample;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class BaseTest {
	
	
	
	WebDriver driver;
	ReadConfig conf;
	
	@Before
	public void launchApp() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		conf = new ReadConfig();
		//driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		
		//http://only-testing-blog.blogspot.com/2013/11/new-test.html
		driver.get(conf.getSampleApplication());
		
		driver.manage().window().maximize();
		
	}
	
	
	@After
	public void closeApp() throws Exception {
		
		System.out.println("closing the application");
		Thread.sleep(7000);
		driver.close();
		//driver.quit();
		
	}
	
	

}
