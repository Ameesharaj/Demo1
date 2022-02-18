package javapracticise;

import java.util.HashSet;

public class occurance {

	public static void main(String[] args) {
String s="india";
char[] ch = s.toCharArray();
	HashSet<Character> set=new HashSet<Character>();
for(int i=0;i<ch.length;i++)
{
	set.add(ch[i]);
}
	System.out.print(set);
	
for(Character character:set) {

	
		int count=0;
		 for(int i=0;i<ch.length;i++) {
			 if (character == ch[i]) {
				 count++;
			 }
		 }
		System.out.println(character+"="+count);
	}
		

}
}

