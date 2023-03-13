package logExample;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NOPComm_LogExample extends BaseTest{
	
	
	

	@Test
	public void serachItems() throws Exception {
		
		log.info("clear the email value");
		driver.findElement(By.id("Email")).clear();;
		log.info("enter email value - ");
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		log.info("clear the password value");
		driver.findElement(By.className("password")).clear();
		Thread.sleep(4000);
		driver.findElement(By.className("password")).sendKeys("admin");
		log.info("enter password value - ");
		
		log.info("click on checkbox Button ");
		driver.findElement(By.name("RememberMe")).click();
		
		
		
		log.info("click on Login Button ");
		driver.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(4000);
		
		
		log.info("after login applicaiton title :  " + driver.getTitle());
		log.info("after login applicaiton url :  " + driver.getCurrentUrl());
		
		
		log.warn("after login applicaiton title :  " + driver.getTitle());
		log.error("after login applicaiton url :  " + driver.getCurrentUrl());
		
		
		
		
		driver.findElement(By.partialLinkText("ogo")).click();
		log.info("click on Logout Button ");
		
	}
	

}
