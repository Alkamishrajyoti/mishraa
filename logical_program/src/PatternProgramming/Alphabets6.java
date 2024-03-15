package PatternProgramming;

public class Alphabets6 
{

	public static void main(String[] args) 
	{
		for(char i='D';i>='A';i--)
		{
			for(char j='D';j>=i;j--)
			{
			System.out.print(j+" ");
			}
		System.out.println();
		}
	}
}
