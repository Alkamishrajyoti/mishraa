package number;

import java.util.Arrays;
import java.util.Scanner;

public class AnaGram 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		if(s1.length()==s2.length())
		{
			char[] a=s1.toCharArray();
			char[] b=s2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			if(Arrays.equals(a, b))
				System.out.println("Anagram");
			else
				System.out.println("Not an Anagram");
		}
		else
			System.out.println("not an Anagram");
			
	}

}
