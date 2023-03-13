package smokeTest;

import utility.ReadConfig;

public class NOPComm {

	public static void main(String[] args) throws Exception {
		
		
		
		//execute test on QA enviornment 
		
		
		ReadConfig conf = new ReadConfig();
		
		System.out.println(conf.getApplicationURL());
		System.out.println(conf.getApplicationURL_DEV());
		//conf.prop.getProperty("appURL_Qa");

	}

}
