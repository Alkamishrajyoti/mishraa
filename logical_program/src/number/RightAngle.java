package number;

public class RightAngle {

	public static void main(String[] args) {
		int space=3;
		int star=1;
		int no=1;
		for(int k=1;k<=4;k++)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				//System.out.print("*");
				System.out.print(no);
				no++;
			}
			space--;
			star=star+1;
			System.out.println();
		}

	}

}
