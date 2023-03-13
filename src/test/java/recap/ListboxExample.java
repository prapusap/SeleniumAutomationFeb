package recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListboxExample extends BaseTest{

	
	
	@Test
	public void listbox() throws Exception {
		
		System.out.println("test case1");
		
		WebElement testingAutomation = driver.findElement(By.id("testingDropdown"));
		
		
		
		Select list = new Select(testingAutomation);
		
		Thread.sleep(2000);
		list.selectByIndex(1);						//Performance Testing
		Thread.sleep(2000);
		list.selectByValue("Automation");			//Automation Testing
		
		Thread.sleep(2000);
		list.selectByVisibleText("Database Testing");//Database Testing
		
	}
}
