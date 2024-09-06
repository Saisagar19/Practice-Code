package practical;

import java.util.Scanner;

public class Array_2 {
	public void AcceptOdd( int b[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array odd elements only: ");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
			if(b[i]%2==0)
			{
				
			}
			

		}
	}
	public void Showodd(int b[])
	{
		System.out.println("Array Elements are: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	public static void main(String[] args) {
		int b[]=new int[5];
		Array_2 m = new Array_2();
		m.AcceptOdd(b);
		m.Showodd(b);
	}

}
