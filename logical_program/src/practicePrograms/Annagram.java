package practicePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Annagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		if(s1.length()==s2.length())
		{
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("annagram");
			}
			else
			{
				System.out.println("not an Annagram");
			}
		}
		else
		{
			System.out.println("Not annagram");
		}

	}

}
