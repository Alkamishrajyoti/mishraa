package PatternProgramming;

public class LeftTriangle {

	public static void main(String[] args) {
		int no=1;
		int space=3;
		int n=1;
		for(int r=1;r>=4;r++)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print(no);
			}
			no++;
			space--;
			n++;
			System.out.println();
		}

	}

}
