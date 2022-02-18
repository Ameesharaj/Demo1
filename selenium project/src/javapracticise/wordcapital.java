package javapracticise;

public class wordcapital {

	public static void main(String[] args) {
		String s="my name is ameesha";
		String[] s1 = s.split(" ");
		
		for(int i=0;i<s1.length;i++) {
			char[] upper = s1[i].toCharArray();
			for(int j=0;j<upper.length;j++) {
				upper[0]=(char) (upper[0]-32);
				System.out.print(upper[j]);
			}
			System.out.print(" ");
		}

	}

}
