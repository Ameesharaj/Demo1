package fileutilitytest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonparse {

	public static String main(String[] args) throws IOException, ParseException {
		FileReader fr=new FileReader("./commondatajson.json ");
		JSONParser jsp=new JSONParser();
		  Object javaobj = jsp.parse(fr);
		  HashMap map=(HashMap)javaobj;
		  String URL=map.get("url").toString();
		  String PWD= map.get("pwd").toString();
		  return PWD;
		  

	}

}
