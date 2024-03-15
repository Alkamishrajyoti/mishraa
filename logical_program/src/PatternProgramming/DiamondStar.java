package PatternProgramming;

public class DiamondStar {

	public static void main(String[] args) {
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
				System.out.print("*");
			}
			space--;
			star=star+2;
			System.out.println();
		}
		int s=1;
		int r=5;
		for(int b=1;b<=4;b++)
		{
			for(int i=1;i<=s;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=r;j++)
			{
				System.out.print("*");
			}
			s++;
			r=r-2;
			System.out.println();
		}
		

	}

}
