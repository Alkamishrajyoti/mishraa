package stringFunction_Program;

public class Split_pgm {

	public static void main(String[] args) 
	{
		String s="I am Ironman";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) 
		{
			System.out.println(split[i]);
		}

	}

}
