package practicePrograms;

import java.util.Scanner;

public class OrderOfOccurance {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String s=sc.next();
		String s="aaabbccccdddzz";
		int[] a=new int[123];
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			a[ch]++;
		}
		for (int j = 0; j < a.length; j++) 
		{
			if(a[j]!=0)
			{
				System.out.print((char) j+""+a[j]+" ");
			}
		}

	}

}
