package sync_conditionalExample;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleElementPresent extends BaseTest {
	

	
	
	
	@Test
	public void promptAlert() throws Exception {
		
		//Thread.sleep(20000); //hard coded delay ----- 20 sec
		
		
		//conditional Wait
		//specific to a condition
		//Scenario ---- specific condition
		
		
		WebDriverWait wait = new WebDriverWait(driver, 120);			//maximum ---- before throwing an exception
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='text3']")));
		
		
		
		driver.findElement(By.cssSelector("input[id='text3']")).sendKeys("enter your name !!");
	
	
		
		
		
	}
	

}
