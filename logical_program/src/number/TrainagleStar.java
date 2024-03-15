package number;

public class TrainagleStar {

	public static void main(String[] args) 
	{
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
				System.out.print("*");
				
			}
			space--;
			star=star+2;
			System.out.println();
		}
		int space1=1;
		int star1=5;
		for(int k=1;k<=4;k++)
		{
			for(int i=1;i<=space1;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
				
			}
			space1++;
			star1=star1-2;
			System.out.println();
		}

	}

}
