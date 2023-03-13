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

public class HandleAlertExample2  {
	
	WebDriver driver;
	ReadConfig conf;
	
	@Before
	public void launchApp() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		conf = new ReadConfig();
		driver.get("http://www.uitestpractice.com/Students/Switchto");
		
		//http://only-testing-blog.blogspot.com/2013/11/new-test.html
		//driver.get(conf.getSampleApplication());
		
		driver.manage().window().maximize();
		
	}
	
	
	@After
	public void closeApp() throws Exception {
		
		System.out.println("closing the application");
		Thread.sleep(10000);
		driver.close();
		//driver.quit();
		
	}
	
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
		driver.findElement(By.cssSelector("[id='prompt']")).click();
	
	
		
		
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
		String expectedAlertText = "Enter your name";
		
		
		//validation step
		//Assert.assertEquals("Your Name Please", promptAlert.getText());
		Assert.assertEquals(expectedAlertText, actualAlertText);
		
		System.out.println("Alert Text: " + actualAlertText);
		
		
		String name = "Ankita Singh";
		Thread.sleep(3000);
		
		promptAlert.sendKeys(name);
		
		Thread.sleep(3000);
		promptAlert.accept();
		//promptAlert.dismiss();
		
		
		
		
		String value = driver.findElement(By.cssSelector("[id='demo']")).getText();
		
		System.out.println(value.contains(name));
		System.out.println(value);
		
		Assert.assertTrue(value.contains(name));
		
		
		
	}
	

}
