package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.io.InputStream;
import java.io.OutputStream;

public class PropertiesFile {
	
	static Properties Property = new Properties(); 
	
	public static void main(String[] args)
	{
	readPropertiesFile("Password");
	//writePropertiesFile();
	}
	
	public static String readPropertiesFile(String input)
	{				
		String Prop = null;		
		try { 											
			InputStream FileRead = new FileInputStream("./src/test/java/resources/config.properties");
			
			 Property.load(FileRead);
			//System.out.println(Property.getProperty("UserName"));
			//PnxBaseTest.PnxBaseTest.BrowserType = Property.getProperty("BrowserType");
			 Prop = Property.getProperty(input);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return Prop;
		
	}
	
	public static void writePropertiesFile()
	{
		try {
			OutputStream output = new FileOutputStream("C:\\Users\\rajkiran\\git\\PhoenixPoliceTest2022\\src\\test\\java\\resources\\config.properties");
			//Property.setProperty("BrowserType", "IE");
			Property.setProperty("result", "pass");
			Property.store(output, null);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
