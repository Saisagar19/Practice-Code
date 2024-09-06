package thurs0703;

import java.util.Scanner;

public class Series {
	int n;
	public void Accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number: ");
		n=sc.nextInt();
		
	}
	public void M1()
	{
		int s;
		for(int i=1;i<=n;i++)
		{
			s=1;
			for(int j=1;j<=i;j++)
			{
				s=s*i;
			}
			System.out.println(s);
		}

	}
	public void M2()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Series s = new Series();
		s.Accept();
		s.M1();
		s.M2();
	}

}
