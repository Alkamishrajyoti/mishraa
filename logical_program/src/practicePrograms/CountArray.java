package practicePrograms;

public class CountArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,1,2,5,3,4};
		int count=1;
		for (int i = 0; i < a.length; i++) 
		{
			count=1;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j]) {
					count++;
					a[j]=122;
				}
			}
			if(a[i]!=122)
			System.out.println(a[i]+" "+count);
		}

	}

}
