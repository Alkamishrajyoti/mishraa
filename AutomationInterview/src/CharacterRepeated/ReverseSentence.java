package CharacterRepeated;

public class ReverseSentence {

	public static void main(String[] args) {
		String s="Hi How are you";
		String[] s1=s.split(" ");
		for(int i=s1.length-1;i>=0;i++)
		{
			System.out.print(rev(s1[i]+" "));
			if(i%2==0)
			{
				System.out.print(rev(s1[i]+" "));
			}
			else
			{
				System.out.print(s1[i]+" ");
			}
		}
	}

	public static  String rev(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}

}
