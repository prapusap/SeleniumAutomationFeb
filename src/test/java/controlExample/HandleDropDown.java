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

public class HandleDropDown extends BaseTest {
	
	
	@Test
	public void verifydropdown_single() throws Exception {
		
		Thread.sleep(4000);
		
		//listbox
		WebElement carSelection = driver.findElement(By.xpath("//select"));			//multiple match ---- by default first 
		
		//Select Class Example
		
		
		Select list = new Select(carSelection);
		
		
		Thread.sleep(4000);
		System.out.println("is dropdown accept multiple selection or not: " + list.isMultiple());      //false
		
		
		//Select value from dropdown
		list.selectByIndex(1);				//Saab
		
		
		Thread.sleep(2000);
		list.selectByValue("USA");			//Volvo
		
		Thread.sleep(2000);
		list.selectByVisibleText("Toyota");	//Toyota
		
		
		
		
		
		
		
	}
	

}
