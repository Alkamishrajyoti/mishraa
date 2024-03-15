package practicePrograms;

public class RightRotation {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int n=2;
		for(int i=1;i<=n;i++)
		{
			int temp=a[a.length-1];
			for (int j = a.length-1; j >=1 ; j--) 
			{
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
