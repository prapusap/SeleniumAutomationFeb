package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() throws Exception {

		FileInputStream fis = new FileInputStream("./data\\config.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String getApplicationURL() {

		String url = prop.getProperty("appURL_QA");
		return url;
	}

	public String getApplicationURL_DEV() {

		return prop.getProperty("appURL_DEV");
		
	}
	
	public String getSampleApplication() {

		return prop.getProperty("sampleURL");
		
	}

}
