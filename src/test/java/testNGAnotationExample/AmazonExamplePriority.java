package testNGAnotationExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonExamplePriority {
	
	
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
//	addItems test case
//	login test case
//	logout test case
//	payment test case
//  close app
	
	
	@Test(priority = 1)
	public void login() {
		
		System.out.println("login test case");
		
	}
	
	@Test(priority = 4)
	public void logout() {
		
		System.out.println("logout test case");
		
	}
	
	
	@Test(priority = 2)
	public void addItems() {
		
		System.out.println("addItems test case");
		
	}
	
	@Test(priority = 3)
	public void payment() {
		
		System.out.println("payment test case");
		
	}
	
	@Test(priority = 3)
	public void cancelOrder() {
		
		System.out.println("cancelOrder test case");
		
	}

}
