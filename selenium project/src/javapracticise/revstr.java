package javapracticise;

public class revstr {

	public static void main(String[] args) {
		String str="welcome to india";
		char[]ch=str.toCharArray();
		//for reversing the word//String[]s=str.split("");
		String rev=" ";
		for(int i=0;i<ch.length;i++) {
			rev=ch[i]+rev;
		}
		System.out.println(rev);
			
		}

	}


