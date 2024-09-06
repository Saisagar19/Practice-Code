package practical;

import java.util.Scanner;

public class Prime {
	int count=0;

	public void PrimeNo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No: ");
		int n=sc.nextInt();
	
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println(+n+" is a Prime No.");
		}
		else
		{
			System.out.println(+n+" is Not a prime No.");
		}
		
	}
	
	
}
