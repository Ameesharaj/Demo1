package fileutilitytest;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromProperties {

	public static void main(String[] args) throws Exception {
	
		FileInputStream fis = new FileInputStream("./commondata.properties");
		Properties p = new Properties();
		p.load(fis);
		String URL = p.getProperty("url");
		String UN = p.getProperty("username");
		String PWD = p.getProperty("password");
		String BRW = p.getProperty("brw");
		System.out.println("URL");
		System.out.println("UN");
		System.out.println("PWD");
		System.out.println("BRW");
		if(BRW.equals("Chrome")) {
			System.out.println("Browser is Chrome");
		}
		else {
			System.out.println("Browser is firefox");
		}
	}

}
