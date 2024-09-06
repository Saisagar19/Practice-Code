package practical;

import java.util.Scanner;

public class Power {
	
	 void Power1()
	{
		int n;
		int power;
		int multi=1;
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a No: ");
		n=sc.nextInt();
		System.out.println("Enter power of that No: ");
		power=sc.nextInt();
		
		for(int i=1;i<=power;i++)
		{
			
			multi=n*multi;
			
		}
		System.out.println("Answer: "+multi);
		
		
		
	}


}
