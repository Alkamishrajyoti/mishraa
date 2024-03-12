package testNG;

import org.testng.annotations.Test;

public class Ggroups {
	@Test(groups= {"g1"})
	public class Group1
	{
		@Test(groups= {"sanity"})
		public void Test1()
		{
			System.out.println("Hello India");
		}
		@Test(groups= {"sanity","regression"})
		public void Test2()
		{
			System.out.println("hello asia");
		}
		@Test(groups= {"regression"})
		public void Test3()
		{
			System.out.println("hello world");
		}
	}
}
