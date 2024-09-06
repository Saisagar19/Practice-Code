package practical;

import java.util.Scanner;

public class Accept_Array {

	public void Accept( int a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();

		}
	}

	public void M1(int a[])
	{
		System.out.println("\nEven elements from Array: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	public void M2(int a[])
	{
		System.out.println("\nodd elements from Array: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	public void M3(int a[]) {
		int cube=0;
		System.out.println("\ncube of elements from Array: ");
		for(int i=0;i<a.length;i++)
		{
			cube=a[i]*a[i]*a[i];
			System.out.print(cube+" ");
		}
		
		


	}
	public void Show(int a[])
	{
		System.out.println("Array Elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int a[]=new int[5];
		Accept_Array n = new Accept_Array();
		n.Accept(a);
		n.Show(a);
		n.M1(a);
		n.M2(a);
		n.M3(a);




	}

}
