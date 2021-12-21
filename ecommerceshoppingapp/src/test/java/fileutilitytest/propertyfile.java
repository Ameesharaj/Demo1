package fileutilitytest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyfile {

	public static void main(String[] args) throws IOException {
		FileInputStream  fis=new FileInputStream("./commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		
		String URL=p.getProperty("url");
		String UN=p.getProperty("username");
		System.out.println("The username is:"+URL);
		System.out.println("The username is:"+UN);
		
		

	}

}

