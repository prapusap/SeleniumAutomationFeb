package screenshotExample;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonExample extends BaseTest{
	
	
	

	@Test
	public void serachItems() throws Exception {
		
		
		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]")).sendKeys("iphone 14 pro max");
		
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		
		
		Thread.sleep(4000);
		Assert.assertTrue(driver.getTitle().contains("iphone 14"));
		
		
		
		//take a screenshot
		//Selenium ---- base64 ----PNG format
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File targetLocation = new File(".\\screenshot\\AmazonSearchItem.png");
		
		
		FileUtils.copyFile(screenshotFile, targetLocation);
		
		
	}
	

}
