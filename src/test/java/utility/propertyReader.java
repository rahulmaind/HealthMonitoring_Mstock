package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyReader 
{
	public static String readpropertydata(String propertyread) throws IOException {
		String path = System.getProperty("user.dir")+"\\src\\main\\resources\\Configd.properties";
		
	FileInputStream File = new FileInputStream(path);
	Properties pro = new Properties();	
	pro.load(File);
	String namevalue = pro.getProperty(propertyread);
	return namevalue;
	}
	
	

}
