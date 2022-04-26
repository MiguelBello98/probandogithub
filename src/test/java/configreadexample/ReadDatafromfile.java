package configreadexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDatafromfile {

	public static void main(String[] args) throws Exception {
		

		FileInputStream fis = new FileInputStream("./\\configfile\\ConfigData.properties");
		
		
		
		Properties pro = new Properties();
		
		pro.load(fis);
		
		
		System.out.println(pro.getProperty("appURL"));
		System.out.println(pro.getProperty("username"));
		System.out.println(pro.getProperty("password"));
		System.out.println(pro.getProperty("executeonbrowser"));

	}

}
