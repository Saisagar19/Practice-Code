package sort;

import java.util.Scanner;

public class Arrays_Acce {
	public static void main(String[] args) {
		int a[]=new int[5];
		Arrays_Acce A = new Arrays_Acce();
		A.Accept(a);
		System.out.println("Array Elements: ");
		A.Display(a);
		System.out.println("Sorted Arrays: ");
		A.Method(a);
		A.Sorted(a);
		
		
	}
	public void Accept(int a[])
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Array elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
	}
	public void Display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+",");
		}
	}
	public void Method(int a[])
	{
		int s=0;
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					s=a[i];
					a[i]=a[j];
					a[j]=s;
				}
			}
		}
		
	}
	public void Sorted(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+",");
		}
	}
	

}
