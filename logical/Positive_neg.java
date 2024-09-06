package logical;

import java.util.Scanner;

public class Positive_neg {
	int n;
	
	public void M1()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No. to check wheather the no. is positive or Negative: ");
		n=sc.nextInt();
	}
	public void check ()
	{
		if(n>0)
		{
			System.out.println("The No. is positive: "+n);
			
		}
		else if(n<0)
		{
			System.out.println("The No. is neagtive: "+n);
		}
		else
		{
			System.out.println("The No. is Zero i.e: "+n);
		}
	}
	public static void main(String[] args) {
		Positive_neg ch = new Positive_neg();
		ch.M1();
		ch.check();
	}

}
