package stringFunction_Program;

public class ReverseSentence 
{
	static String reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		String s="I can do this all day";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) 
		{
			System.out.print(reverse(split[i])+" ");
		}
	}

}
