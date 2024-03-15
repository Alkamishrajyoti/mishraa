package PatternProgramming;

public class Alphabets7 
{

	public static void main(String[] args) 
	{
		for(char i='D';i>='A';i--)
		{
			for(char j='D';j>=i;j--)
			{
			System.out.print(i+" ");
			}
		System.out.println();
		}
	}
}
