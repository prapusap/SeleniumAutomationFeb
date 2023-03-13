package controlExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class HandleInputBoxMultipleMatch extends BaseTest {
	
	
	@Test
	public void verifydropdown_single() throws Exception {
		
		Thread.sleep(4000);
		
//		//listbox
//		WebElement inputEle = driver.findElement(By.xpath("//input"));			//14
//		
//		
//		//getting multiple match ----- by default it will perform action on first element
//		inputEle.sendKeys("ashdlkaslkd");
		
		
		
		//listbox
				WebElement anyElement = driver.findElement(By.xpath("//form"));			//14
				
				
				//getting multiple match ----- by default it will perform action on first element
				System.out.println(anyElement.getText());
		
		
		Thread.sleep(4000);
		
		
		
		
	}
	

}
