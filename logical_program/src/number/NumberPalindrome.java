package number;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		final int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=(sum*10)+rem;
			no=no/10;
										
		}
		if(copy==sum)
			System.out.println("Number Palindrome");
		else
			System.out.println("Not an Palindrome");

	}

}
