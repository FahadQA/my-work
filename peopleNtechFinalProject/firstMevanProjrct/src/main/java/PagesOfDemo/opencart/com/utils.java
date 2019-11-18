package PagesOfDemo.opencart.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utils {
	
	public Properties properties = new Properties();
	
	File file = new File("testData");
	

	 public utils() throws IOException
	 {
		 FileInputStream file2 = new FileInputStream(file);
		 properties.load(file2);
		 file2.close();
	 }
	

}
