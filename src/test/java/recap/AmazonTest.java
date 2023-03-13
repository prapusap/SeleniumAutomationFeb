package recap;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{
	
	
	@Test
	public void serachItems() throws Exception {
		
		
		//validation step
		Assert.assertTrue(driver.getTitle().contains("Shopping site in India"));
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
		
		
		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]")).sendKeys("iphone 14");
		
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		
		
		Thread.sleep(4000);
		Assert.assertTrue(driver.getTitle().contains("iphone 14"));
		
		
	}

}
