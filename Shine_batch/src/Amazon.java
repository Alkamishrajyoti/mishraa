
public class Amazon 
{
	static void Submit() throws AmazonException
	{
		int amount=4000;
		if (amount>=5000)
		{
			System.out.println ("Descount");
		}
		else
		{
			throw new AmazonException("No discount");
		}
		}
public static void main(String[] args) 
{
	try {
		

       Submit();
}
 catch ( AmazonException e )
 {
	 System.out.println(e.get());
	 }
 }
 }
 class AmazonException extends Exception
 {
	 String msg;
	 AmazonException (String msg)
	 {
		 this.msg = msg;
		 }
	public String get ()
	{
		return msg ;
		
		}
	 
 }
 
