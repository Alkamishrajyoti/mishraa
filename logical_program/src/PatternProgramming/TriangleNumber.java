package PatternProgramming;

public class TriangleNumber 
{
	public static void main(String[] args) 
	{
		int no=1;
		int space=3;
		int star=1;
		for(int k=1;k<=3;k++)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print(no);
				no++;
			}
			space--;
			star=star+2;
			System.out.println();
		}
	

	}
}
