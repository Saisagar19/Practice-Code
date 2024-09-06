package logical;

import java.util.Scanner;

public class Prime {
	int n;
	public void Accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		n=sc.nextInt();

	}
	public void Check()
	{
		int cnt=0;

		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				cnt++;
			}
		}
		if(cnt==2)
		{
			System.out.println("the number is prime");
		}
		else
		{
			System.out.println("the number is not prime");
		}
	}
	public static void main(String[] args) {
		Prime p=new Prime();
		p.Accept();
		p.Check();
	}
}
