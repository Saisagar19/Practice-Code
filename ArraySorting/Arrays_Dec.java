package sort;

import java.util.Scanner;

public class Arrays_Dec {
	public static void main(String[] args) {
		int y[]=new int[6];
		Arrays_Dec D = new Arrays_Dec();
		D.Accept(y);
		D.Display(y);
		D.Method(y);
		D.Sorted(y);
		
	}
	public void Accept(int y[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(int i=0;i<y.length;i++)
		{
			y[i]=sc.nextInt();		
		}
	}
	public void Display(int y[])
	{
		System.out.println("Arrays: ");
		for(int i=0;i<y.length;i++)
		{
			System.out.print(y[i]+",");
		}
		System.out.println();
	}
	public void Method(int y[])
	{
		int n=0;
		for(int i=0;i<y.length;i++)
		{
			for(int j=i+1;j<y.length;j++)
			{
				if(y[i]<y[j])
				{
					n=y[i];
					y[i]=y[j];
					y[j]=n;
				}
			}
		}
	}
	public void Sorted(int y[])
	{
		System.out.println("Sorted Arrays: " );
		for (int i=0;i<y.length;i++)
		{
			System.out.print(y[i]+",");
		}
	}

}
