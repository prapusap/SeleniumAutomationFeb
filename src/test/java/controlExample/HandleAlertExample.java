package controlExample;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;
import utility.ReadConfig;

public class HandleAlertExample extends BaseTest {
	

	
	//@Test
	public void SimpleAlert() throws Exception {
		
		Thread.sleep(3000);
		
//		Alert ---- javascript
		//can't inspect alert
		
		
		//click on simple alert button
		driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
	
	
		
		
		//handle alert
		//Alert/iframe/windows ------- driver.switchTo()
		
		
		//action on alert
		//accept ----- ok
		//dismiss ---- cancel 
		//getText
		//SendKeys
		
		
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		
		
		Alert simpleALert = driver.switchTo().alert();
		
		
		
		String actualAlertText = simpleALert.getText();
		String expectedAlertText = "Hi.. This is alert message!";
		
		
		//validation step
		Assert.assertEquals("Hi.. This is alert message!", simpleALert.getText());
		Assert.assertEquals(expectedAlertText, actualAlertText);
		
		System.out.println("Alert Text: " + simpleALert.getText());
		
		//simpleALert.accept();
		simpleALert.dismiss();
		
		
	}
	
	
	
	@Test
	public void promptAlert() throws Exception {
		
		Thread.sleep(3000);
		
//		Alert ---- javascript
		//can't inspect alert
		
		
		//click on simple alert button
		driver.findElement(By.xpath("//button[@onclick='myFunctionf()']")).click();
	
	
		
		
		//handle alert
		//Alert/iframe/windows ------- driver.switchTo()
		
		
		//action on alert
		//accept ----- ok
		//dismiss ---- cancel 
		//getText
		//SendKeys
		
		
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		
		
		Alert promptAlert = driver.switchTo().alert();
		
		
		
		
		String actualAlertText = promptAlert.getText();
		String expectedAlertText = "Your Name Please";
		
		
		//validation step
		//Assert.assertEquals("Your Name Please", promptAlert.getText());
		Assert.assertEquals(expectedAlertText, actualAlertText);
		
		System.out.println("Alert Text: " + actualAlertText);
		
		
		String name = "Abhay";
		Thread.sleep(3000);
		
		promptAlert.sendKeys(name);
		
		Thread.sleep(3000);
		promptAlert.accept();
		//promptAlert.dismiss();
		
		
	}
	

}
