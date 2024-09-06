package logical;

import java.util.Scanner;

public class Even_odd {
	int n;
	public void M1()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No. to check wheather the no. is Even or Odd: ");
		n=sc.nextInt();
	}
	public void Check()
	{
		if(n%2==0)
		{
			System.out.println("The no. is even: "+n);
		}
		else
		{
			System.out.println("The no. is odd: "+n);
		}
	}
	public static void main(String[] args) {
		
		Even_odd ch=new Even_odd();
		ch.M1();
		ch.Check();
	}

}
