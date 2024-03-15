package number;

public class SumOfEvenNoArray 
{
	public static void main(String[] args) 
	{
		int[] a= {15,20,35,40,50};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}
}
