package practicePrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		prime(1,1000);

	}
	static void prime(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			int no=i;
			boolean flag=true;
			for(int j=2;j<no;j++)
			{
				if(no%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println(no+" Prime");
			}
//			else
//			{
//				System.out.println(no+" Not Prime");
//			}
		}
	}

}
