package logExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	Logger log;
	@BeforeTest
	public void setup() throws Exception {
		
		
		log = Logger.getLogger("NOP Comm Login Module");
		PropertyConfigurator.configure(".\\data\\IBM_log4j.properties");
		
		
		
		
		System.out.println("launching app");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		log.info("launch chrome browser");
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		log.info("application launch successfully.");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
	}
	

	
	@AfterTest
	public void teardown() throws Exception {
		
		System.out.println("closing app");
		Thread.sleep(5000);
		
		log.info("application close successfully.");
		driver.close();
		
	}
	
	
	
	
}
