package utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class jsonutility {
	
	public String readdata(String key) throws IOException, ParseException {
		
	
	FileReader fr=new FileReader(Ipathconstants.Jsonpath);
	JSONParser jp=new JSONParser();
	Object obj = jp.parse(fr);
	HashMap map=(HashMap)obj;
	String value=map.get(key).toString();
	return value;
	
	
	
	
	}
	
	
	

}
