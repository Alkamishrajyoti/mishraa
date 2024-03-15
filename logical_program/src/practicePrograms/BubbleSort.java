package practicePrograms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter values");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
//		int[] a= {50,40,60,10,20,70,5};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-1; j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
