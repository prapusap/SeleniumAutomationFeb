package testNGAnotationExample;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonExamplePriority2 {
	
	
	//Priority 
	//by default ---- priority ---- 0
	//highest negative number having highest priority
	//if priority is same ----- execution as per naming conv (ASCII value)
	
	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launch application");
		
	}
	
	@AfterTest
	public void closeApp() {
		
		System.out.println("closing application");
		
	}
	
	
	//workflow
//	launch application
//	login test case
//	addItems test case
//	cancelOrder test case
//	logout test case
//	closing application
	
	
	@Test(priority = 1)
	public void login() {
		
		System.out.println("login test case");
		
	}
	
	@Test(priority = 4, dependsOnMethods = "login")
	public void logout() {
		
		System.out.println("logout test case");
		
	}
	
	
	@Test(priority = 2, description = "Adding items to Cart Feature.")
	public void addItems() {
		
		System.out.println("addItems test case");
		
		Assert.assertTrue(false, "validation of add items get failed");
		
	}
	
	
	@Test(priority = 2, dependsOnMethods = "addItems")
	public void cancelOrder() {
		
		System.out.println("cancelOrder test case");
		
	}
	
}
