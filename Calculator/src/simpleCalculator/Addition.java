package simpleCalculator;

public class Addition {
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		new Addition().add(10, 20);
		
	}
}


