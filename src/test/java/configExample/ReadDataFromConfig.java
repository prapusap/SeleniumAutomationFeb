package configExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromConfig {

	Properties prop;
	
	public ReadDataFromConfig() throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\recapConfig.properties");
	
		prop = new Properties();
		
		prop.load(fis);
		
	
	}
	
	public String getAppURL() {
		
		return prop.getProperty("ibm_sampleAPP");
	}

}
