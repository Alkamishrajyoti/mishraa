package number;

public class ArmStrong {

	public static void main(String[] args) {
		for(int i=1;i<=1000;i++)
		{
			int no=i;
			int copy=no;
			int sum=0;
			while(no!=0)
			{
				int rem=no%10;
				sum=sum+(rem*rem*rem);
				no=no/10;
			}
			if(copy==sum)
			{
				System.out.println(i+" Arm Strong number");
			}
			
		}

	}

}
