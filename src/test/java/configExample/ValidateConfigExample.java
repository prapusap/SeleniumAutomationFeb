package configExample;

import org.junit.Test;

public class ValidateConfigExample {

	
	@Test
	public void verifyTest() throws Exception {
		
		ReadDataFromConfig conf = new ReadDataFromConfig();
		
		System.out.println(conf.getAppURL());
		
		
	}

}
