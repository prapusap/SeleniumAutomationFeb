package smokeTest;

import org.junit.Test;

import utility.ReadConfig;

public class NOPComm_JUnit {
	
	
	//unit testing framework
	
	@Test
	public void launchApp() throws Exception {
		
		ReadConfig conf = new ReadConfig();
		
		System.out.println(conf.getApplicationURL());
		System.out.println(conf.getApplicationURL_DEV());
		
	}
	
	
	

}
