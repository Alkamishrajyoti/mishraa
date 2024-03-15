package number;

public class SumOfOddNoArray 
{
	public static void main(String[] args) 
	{
		int[] a= {15,20,35,40,55};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
			sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}
}
