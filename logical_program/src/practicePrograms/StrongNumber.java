package practicePrograms;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
	
		final int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+fact(rem);
			no=no/10;
		}
		if(copy==sum)
		{
			System.out.println("Strong");
		}
		else
		{
			System.out.println("Not Strong");
		}
	}
	static int fact(int n)
	{
		int f=1;
		for(int i=n;i>=1;i--)
		{
			f=f*i;
		}
		return f;
	}

}
