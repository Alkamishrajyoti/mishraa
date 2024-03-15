package PatternProgramming;

public class Demo {

	public static void main(String[] args) {
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
