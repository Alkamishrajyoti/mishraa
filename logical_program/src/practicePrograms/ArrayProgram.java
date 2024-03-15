package practicePrograms;

public class ArrayProgram {
	static void palindrome(int no)
	{
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=(sum*10)+rem;
			no=no/10;
		}
		if(copy==sum)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not palindrome");
		
	}

	public static void main(String[] args) {
		int[] a= {1,2,12,14,222,312};
		int sum1=0;
		int sum2=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>=0&&a[i]<=9)
			{
				sum1=sum1+a[i];
			}
			else if(a[i]>=10&&a[i]<=99)
			{
				sum2=sum2+a[i];
			}
			else
			{
				palindrome(a[i]);
			}
			
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}
	

}
