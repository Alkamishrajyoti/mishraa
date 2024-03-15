package practicePrograms;

public class OOC {

	public static void main(String[] args) {
		String s="aaabbccfeeeedffbbre";
		int[] c=new int[123];
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			c[ch]++;
			
		}
		for (int j = 0; j < c.length; j++) 
		{
			if(c[j]!=0)
			System.out.print((char)j+""+c[j]+" ");
		}

	}

}
