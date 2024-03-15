package practicePrograms;

import java.util.Scanner;

public class CountInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=1;
		for(int i=0;i<a.length;i++)
		{
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=200;
				}
				else
				{
					continue;
				}
				
			}
			if(a[i]!=200) {
			System.out.println(a[i]+" "+count);
			}
		}
		
	}

}
