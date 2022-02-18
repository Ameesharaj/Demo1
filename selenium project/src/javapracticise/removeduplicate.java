package javapracticise;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class removeduplicate {

	public static void main(String[] args) {
String s="prakash"; //praksh

//step1
char[]ch=s.toCharArray();

//step2
//HashSet<Character>set=new HashSet<Character>();
LinkedHashSet<Character>set=new LinkedHashSet<Character>();
for(int i=0;i<ch.length;i++) {
	set.add(ch[i]);
	
}
for(Character character:set) {
	System.out.print(character);
	
}
	
}

	

}
