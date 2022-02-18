package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class readfromdata {
	@Test
	
	public void  file () throws IOException{
		FileInputStream fis =new FileInputStream("./common.properties");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		FileOutputStream fos=new FileOutputStream("./common.properties");
		p.setProperty("url", "https://www.facebook.com/");
		p.setProperty("un", "admin");
		System.out.println("url");
		
		p.save(fos, "updated by us");
		
		
	}

}
