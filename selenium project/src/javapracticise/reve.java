package javapracticise;

import java.util.HashSet;

public class reve {

	public static void main(String[] args) {
String s="ameesha";
char[] ch = s.toCharArray();
HashSet<Character>set=new HashSet<Character>();
for(int i=0;i<ch.length;i++) {
	set.add(ch[i]);{
		System.out.println(set.add(ch[i]));
	}
	
}
for(Character character:set) {
	int count=0;
	for(int i=0;i<ch.length;i++) {
		if(character==ch[i])
			count++;
	}
	
	System.out.println(character+"="+count);
	
}
	}

}
