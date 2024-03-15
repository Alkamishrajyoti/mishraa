package PatternProgramming;

public class Alphabets4 
{
	public static void main(String[] args) 
	{
		for(char i='A';i<='D';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
