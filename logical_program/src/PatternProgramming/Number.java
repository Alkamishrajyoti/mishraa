package PatternProgramming;

public class Number {

	public static void main(String[] args) 
	{
		int no=1;
		int space=3;
		int star=1;
		for(int a=1;a<=4;a++)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print(no);
			}
			no++;
			space--;
			star++;
			System.out.println();
		}

	}

}
