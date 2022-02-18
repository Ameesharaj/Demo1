package javapracticise;

public class pract {

	public static void main(String[] args) {
String str="good after noon";
char[]ch=str.toCharArray();
String[]s=str.split(" ");
String rev=" ";
	for(int i=0;i<s.length;i++) {
		rev=s[i]+" "+rev;
		
	}
	System.out.println(rev);
}

	}


