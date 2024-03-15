package practicePrograms;

public class ReverseSentence {

	public static void main(String[] args) {
		String s="I can do this all day";
		String[] arr = s.split(" ");
		for (int i = arr.length-1; i >=0 ; i--) 
		{
			if(i%2==0)
			System.out.print(reverse(arr[i])+" ");
			else
				System.out.print(arr[i]+" ");
		}

	}
	static String reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}

}
