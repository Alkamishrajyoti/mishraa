package stringFunction_Program;

public class CharArray_pgms {

	public static void main(String[] args) 
	{
		String s="QSPIDERS";
		char[] charArray = s.toCharArray();
		for (int i = charArray.length-1; i >=0 ; i--) 
		{
			System.out.print(charArray[i]);
		}

	}

}
