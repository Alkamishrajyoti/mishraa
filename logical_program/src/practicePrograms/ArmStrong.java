package practicePrograms;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		final int copy=no;
		int sum=0;
		int dig=0;
		while(no!=0)
		{
			dig++;
			no=no/10;
			
		}
		
		no=copy;
		while(no!=0)
		{
			int rem=no%10;
			sum=(int) (sum+Math.pow(rem, dig));
			no=no/10;
		}
		if(copy==sum)
		{
			System.out.println(copy+" Arm Strong");
		}
		else
		{
			System.out.println(copy+" Not ArmStrong");
		}

	}

}
