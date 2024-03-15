package number;

import java.util.ArrayList;

public class Coolection_print {

	public static void main(String[] args) {
		int no=3412;
		ArrayList a=new ArrayList();
		while(no!=0)
		{
			int rem=no%10;
			a.add(rem);
			no=no/10;
		}
		for(Object o:a)
		{
			System.out.println(o);
		}

	}

}
