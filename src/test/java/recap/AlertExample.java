package recap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class AlertExample extends BaseTest{

	
	
	@Test
	public void PromptAlert() throws Exception {
		
		
		driver.findElement(By.cssSelector("[id=prompt]")).click();
		
		
		//handle alert
//		accept
//		dismiss
//		getText
//		sendKeys
		
		
		Alert ibmPrompt = driver.switchTo().alert();
		
		System.out.println(ibmPrompt.getText());
		
		Assert.assertEquals(ibmPrompt.getText(), "Enter your name");
		
		
		ibmPrompt.sendKeys("Abhishek");
		
		Thread.sleep(2000);
		//ibmPrompt.accept();
		ibmPrompt.dismiss();
		
//		String validation_ok_cancel = driver.findElement(By.cssSelector("[id=demo]")).getText();
//		
//		System.out.println(validation_ok_cancel);
//		
//		Assert.assertTrue(validation_ok_cancel.contains("Abhishek"));
		
	}
	
	
	
}
