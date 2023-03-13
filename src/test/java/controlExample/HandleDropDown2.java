package controlExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class HandleDropDown2 extends BaseTest {
	
	
	@Test
	public void verifydropdown_multiple() throws Exception {
		
		Thread.sleep(4000);
		
		//listbox
		WebElement countrySelection = driver.findElement(By.xpath("//select[@name=\"FromLB\"]"));			//multiple match ---- by default first 
		
		//Select Class Example
		
		
		Select list = new Select(countrySelection);
		
		
		Thread.sleep(4000);
		System.out.println("is dropdown accept multiple selection or not: " + list.isMultiple());      //true
		
		
		//Select value from dropdown
		list.selectByIndex(0);				//USA
		
		
		Thread.sleep(2000);
		list.selectByValue("India");			//India
		
		Thread.sleep(2000);
		list.selectByVisibleText("Germany");	//Germany
		list.selectByVisibleText("Russia");		//Russia
		
		
		
		Thread.sleep(4000);
		//DeSelection
		
		list.deselectByIndex(1);				//Russia
		
		
		Thread.sleep(2000);
		list.deselectByValue("USA");			//USA
		
		Thread.sleep(2000);
		list.deselectByVisibleText("Germany");	//Toyota
		
		
		Thread.sleep(4000);
		list.selectByVisibleText("Germany");	//Toyota
		list.selectByVisibleText("Russia");		//Russia
		
		//DeSelection all 
		
		list.deselectAll();
		
		
		Thread.sleep(2000);
		list.selectByValue("India");			//India
		
		
		
		
	}
	

}
