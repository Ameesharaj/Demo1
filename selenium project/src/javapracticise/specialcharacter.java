package javapracticise;

public class specialcharacter {

	public static void main(String[] args) {
		String s="abcd1234*";
		String alpha="";
		String sp="";
		String num="";
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='z')
			{
				alpha=alpha+ch[i];
			}
			else if(ch[i]>='0'&&ch[i]<='9') {
				num=num+ch[i];
			}
			else {
				sp=sp+ch[i];
			}
		}
		
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(sp);

	}

}
