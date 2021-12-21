

package fileutilitytest;




	import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

	import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




	public class readfromjsonfile {
		
		public String readfromjsonfile (String key) throws IOException, ParseException
		{
	FileReader fr =new FileReader("./commondatajson.json");
	JSONParser jsp = new JSONParser();
	Object javaObj = jsp.parse(fr);
	HashMap map=(HashMap)javaObj;
	String url=map.get("url").toString();
	String pwd=map.get("pwd").toString();
	return pwd;
		}
		


	}


	
