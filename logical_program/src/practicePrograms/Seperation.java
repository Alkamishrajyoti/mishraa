package practicePrograms;

import java.util.Scanner;

public class Seperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String uc="";
		String lc="";
		String dig="";
		String spl="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=65&&ch<=90)
				uc=uc+ch;
			else if(ch>=97&&ch<=122)
				lc=lc+ch;
			else if(ch>=48&&ch<=57)
				dig=dig+ch;
			else
				spl=spl+ch;
		}
		System.out.println(uc);
		System.out.println(lc);
		System.out.println(dig);
		System.out.println(spl);
	}

}
