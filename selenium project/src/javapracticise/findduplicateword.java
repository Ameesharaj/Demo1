package javapracticise;

import java.util.HashSet;

public class findduplicateword {

	public static void main(String[] args) {
String s="welcome to welcome";
char[]ch=s.toCharArray();
String[]str=s.split("");

HashSet<String>set= new HashSet<String>();
for(int i=0;i<str.length;i++) {
	set.add(str[i]);
}
System.out.println(set);
	
for(String c:set) {
	int count=0;
	for(int i=0;i<str.length;i++) {
		if(c.equals(str[i])) {
		count++;
		
	}
}
	if(count>1) {
		System.out.println(c+"="+count);
	}
	
}
	}
}


