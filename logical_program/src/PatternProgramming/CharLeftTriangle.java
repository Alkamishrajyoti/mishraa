package PatternProgramming;

public class CharLeftTriangle 
{
	public static void main(String[] args) 
	{
		char c='A';
		int space=3;
		int star=1;
		for(int k=1;k<=4;k++)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print(c);
				
			}
			c++;
			space--;
			star=star+1;
			System.out.println();
		}

	}
}
