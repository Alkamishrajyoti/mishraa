package stringFunction_Program;

public class ReverseOddIndex 
{
	static String reverse(String s)
	{
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		return r;
	}
	public static void main(String[] args) {
		String s="Wake up to Reallity";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) 
		{
			if(i%2==1)
				System.out.print(reverse(s1[i])+" ");
			else
			{
				System.out.print(s1[i]+" ");
			}
		}
	}

}
