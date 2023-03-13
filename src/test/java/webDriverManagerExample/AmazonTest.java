package webDriverManagerExample;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	
	
	
	@Test
	public void verifySearch() {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		
		driver.get("https://www.amazon.in/");
		
		
	}
	

}
