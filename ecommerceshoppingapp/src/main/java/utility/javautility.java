package utility;

import java.util.Date;


public class javautility {

	public String getSysDate() {
		Date d = new Date();
		String  date =d.toString().replace(" ","_").replace(":", "_");
		return date;
	}
}
