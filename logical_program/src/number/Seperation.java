package number;

import java.util.Scanner;

public class Seperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		String alpha="";
		String num="";
		String spl="";
		for (int i = 0; i < s.length(); i++) 
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				alpha=alpha+s.charAt(i);
			}
			else if(Character.isDigit(s.charAt(i)))
			{
				num=num+s.charAt(i);
			}
			else
			{
				spl=spl+s.charAt(i);
			}
						
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(spl);

	}

}
