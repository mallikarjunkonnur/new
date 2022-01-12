package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public abstract class BaseClass {
	
	Properties prop;
	FileInputStream fis;
	
	public BaseClass() throws IOException {
		
		 prop = new Properties();
		
		 fis = new FileInputStream("C:\\Users\\Mallikarjun\\eclipse-workspace\\KiteZerodhaMavenProject\\config.properties");
		
		prop.load(fis);
		
	}

}
