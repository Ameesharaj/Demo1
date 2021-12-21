

package utility;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyutilityfile {
	public String readdata(String key) throws IOException {
		FileInputStream fis=new FileInputStream(Ipathconstants.propertypath);
		Properties p=new Properties();
		p.load(fis);
		
	String value=p.getProperty(key);
		  return value;
	}

}
