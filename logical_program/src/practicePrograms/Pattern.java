package practicePrograms;

public class Pattern {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
//				if(i==1||i==3)
				if(j==1||j==3)
					System.out.print(3);
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
