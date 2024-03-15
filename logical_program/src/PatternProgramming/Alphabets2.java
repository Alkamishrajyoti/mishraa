package PatternProgramming;

public class Alphabets2 
{
	public static void main(String[] args) 
	{
		for(char i='A';i<='D';i++)
		{
			for(char j='D';j>='A';j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
