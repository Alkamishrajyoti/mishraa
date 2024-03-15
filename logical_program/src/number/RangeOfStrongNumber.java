package number;

public class RangeOfStrongNumber 
{
	static int fact(int value)
	{
		int fact=1;
		for(int i=value;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++)
		{
		int no=i;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+fact(rem);
			no=no/10;
		}
		if(copy==sum)
			System.out.println(i+" Strong Number");
		
		}

	}

}
