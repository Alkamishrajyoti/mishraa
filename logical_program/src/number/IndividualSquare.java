package number;

public class IndividualSquare {

	public static void main(String[] args) {
		int no=2233;
		while(no!=0)
		{
			int rem=no%10;
			System.out.println(rem*rem);
			no=no/10;
		}

	}

}
