package practical;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {

		int y[]=new int[10];
		Array A=new Array();
		A.Accept(y);
		A.Show(y);
	}
	public void Accept(int y[])
	{
		Scanner sc=new Scanner(System.in);
		int len=y.length;
		System.out.println("Length-->"+len);
		System.out.println("Enter Value to the Array: ");
		for(int i=0;i<y.length;i++)
		{
			y[i]=sc.nextInt();
		}

	}
	public void Show(int y[])

	{
		System.out.println("..........");
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
	}
}
