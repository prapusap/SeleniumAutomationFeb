package locatorExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HRMLogin {
	
	
	
	//pre-condition --------- Before
	//test          --------- Test
	//post-condition-------- After
	
	
	//
	
	@Test
	public void verifyLoginFeatureWithValidCredenatils(){
		
		System.out.println("login test case");
		
	}
	
	
	
	
	@After
	public void closeApp() {
		
		System.out.println("closinging application");
	}
	
	@Before
	public void launchApp() {
		
		System.out.println("launching application");
	}

}
