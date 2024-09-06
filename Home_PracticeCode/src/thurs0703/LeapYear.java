package thurs0703;

import java.util.Scanner;

public class LeapYear {
	
	int n1;
	int n2;
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter from: ");
		n1=sc.nextInt();
		System.out.println("to: ");
		n2=sc.nextInt();
	}
	public void Logic()
	{
		int count=0;
		for(int i=n1;i<=n2;i++)
		{
			if(i%4==0)
			{
				System.out.println(i+" is a leap year");
				count++;
			}
		}
		System.out.println("Total leap years are: "+count);
	}
	public static void main(String[] args) {
		
		LeapYear l = new LeapYear();
		l.accept();
		l.Logic();
	}

}
