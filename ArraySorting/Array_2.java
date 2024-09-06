package sort;

import java.util.Scanner;

public class Array_2 
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Size: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		Array_2 G = new Array_2();
		G.Accept(a);
		G.Display(a);
		G.Method(a);
		G.Rev(a);
	}
	
	public void Accept(int a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array elements: ");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();		
		}
	}
	public void Display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
	}
	public void Method(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int f[]=new int[a.length];
			int j=a.length;
			f[j-1]=a[i];
			j=j-1;
		}
		
		
	}
	public void Rev(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+",");
		}
	}
	
}
