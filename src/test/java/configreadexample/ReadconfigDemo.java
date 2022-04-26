package configreadexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadconfigDemo {
	
	Properties pro;

	public ReadconfigDemo() throws Exception {

		FileInputStream fis = new FileInputStream("./\\configfile\\ConfigData.properties");

		pro = new Properties();

		pro.load(fis);

	}

	public String getAppURL() {

		String appURL = pro.getProperty("appURL");
		return appURL;

	}
	public String getAdminusername() {

		 
		return pro.getProperty("username");

	}
	
	public String getAdminpassword() {

		
		return pro.getProperty("password");

	}
	
	
	

}
