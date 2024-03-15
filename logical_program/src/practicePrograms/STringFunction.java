package practicePrograms;

public class STringFunction 
{

	public static void main(String[] args) 
	{
		String s="I have 210 mangos";
		String[] a=s.split(" ");
		String h=a[2];
		int no=Integer.parseInt(h);
		no=no+40;
		a[2]=String.valueOf(no);
		for(String o:a)
		{
			System.out.print(o+" ");
		}

	}

}
