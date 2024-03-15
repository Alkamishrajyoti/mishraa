package PatternProgramming;

public class TriangleCharacter 
{
	public static void main(String[] args) 
	{
		char c='A';
		char space='C';
		char star='A';
		for(int k=1;k<=4;k++)
		{
			for(char i='A';i<=space;i++)
			{
				System.out.print(" ");
			}
			for(char j='A';j<=star;j++)
			{
				System.out.print(j);
				
			}
			
			space--;
			star=(char) (star+2);
			System.out.println();
		}

	}

}
