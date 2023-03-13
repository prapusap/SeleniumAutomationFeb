package recap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws Exception {
		
		System.out.println("launching app");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//driver.get("https://www.amazon.in/");
		//driver.get("http://www.uitestpractice.com/Students/Switchto");
		driver.get("D:\\Jar_files\\sample_application\\Test.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
	}
	

	
	@AfterTest
	public void teardown() throws Exception {
		
		System.out.println("closing app");
		Thread.sleep(5000);
		driver.close();
		
	}
	
}
