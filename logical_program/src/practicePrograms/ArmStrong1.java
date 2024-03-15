package practicePrograms;

import java.util.Scanner;

public class ArmStrong1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		final int copy=no;
		int sum=0;
		int digit=0;
		while(no!=0)
		{
			no=no/10;
			digit++;
		}
		
		no=copy;
		while(no!=0)
		{
			int rem=no%10;
			sum=(int) (sum+Math.pow(rem, digit));
			no=no/10;
		}
		if(copy==sum)
		
			System.out.println("ArmStrong");
		
		else
			System.out.println("Not ArmStrong");

	}

}
