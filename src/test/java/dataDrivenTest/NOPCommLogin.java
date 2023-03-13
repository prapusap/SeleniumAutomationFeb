package dataDrivenTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NOPCommLogin extends BaseTest{
	
	
	@Test(dataProvider = "regressionData")
	public void verifyLoginFeatureWithInValidCred(String email, String pwd) throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys(email);
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Password")).sendKeys(pwd);
		
		
		driver.findElement(By.xpath("//input[@name='RememberMe']")).click();
		
		
		driver.findElement(By.tagName("button")).click();
		
		
		//invalid credentials ----validate error message
		Assert.assertTrue(driver.getPageSource().contains("Login was unsuccessful"));
		
		Thread.sleep(4000);
	}
	
	
	@DataProvider
	public Object[][] sampleData() {
		
		
		Object[][] data = { {"abhay@google.com", "welcome@1"}, {"Aditi@gmail.com", "demo@1"}, {"Merin@outlook.com", "automation@1"} };
		
		return data;
	}
	
	
	@DataProvider
	public Object[][] regressionData() {
		
		
		Object[][] data = { {"abhayregression@google.com", "welcome@1"}, {"Aditiregression@gmail.com", "demo@1"}, {"Merinregression@outlook.com", "automation@1"}, {"Ankita@outlook.com", "automation@1"}};
		
		return data;
	}
	
	

}
