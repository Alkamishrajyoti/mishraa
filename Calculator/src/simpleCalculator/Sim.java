package simpleCalculator;

public class Sim {
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void sub(int c,int d)
	{
		int s=c+d;
		System.out.println(c);
	}
	void mul(int x,int y)
	{
		int m=x+y;
		System.out.println(m);
	}
	void div(int m,int n)
	{
		int z=m+n;
		System.out.println(z);
	}
public static void main(String[] args) {
	Sim s = new Sim();
	s.add(-1, 20);
	s.sub(-1, -5);
	s.mul(10, -10);
	s.div(-10, 2);
}
}
