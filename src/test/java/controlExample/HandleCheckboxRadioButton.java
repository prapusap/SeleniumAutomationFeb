package controlExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class HandleCheckboxRadioButton extends BaseTest {
	
	
	@Test
	public void verifyCheckboxRadioBtn() throws Exception {
		
		Thread.sleep(4000);
		
		//checkbox
		driver.findElement(By.xpath("//input[@value='Boat']")).click();
		
		
		Thread.sleep(4000);
		
		//radiButton
		driver.findElement(By.cssSelector("input[value='female']")).click();
		
		
	}
	

}
