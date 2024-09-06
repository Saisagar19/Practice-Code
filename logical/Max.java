package logical;

import java.util.Scanner;

public class Max {
	int num1;
	int num2;
	int num3;
	public void M1()
	{
		System.out.println("Find Maximum from two num: ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num1: ");
		num1=sc.nextInt();
		System.out.println("Enter Num2: ");
		num2=sc.nextInt();
		
	}
	public void check()
	{
		if(num1>num2)
		{
			System.out.println("Max num is : "+num1);
		}
		else
		{
			System.out.println("Max num is : "+num2);
		}
	}
	public void M2()
	{
		System.out.println("Find Maximum from three num: ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num1: ");
		num1=sc.nextInt();
		System.out.println("Enter Num2: ");
		num2=sc.nextInt();
		System.out.println("Enter Num3: ");
		num3=sc.nextInt();
		
	}
	public void check1()
	{
		if(num1>num2 && num1>num3)
		{
			System.out.println("Max num is : "+num1);
		}
		else if(num2>num3 && num2>num1)
		{
			System.out.println("Max num is : "+num2);
		}
		else {
			System.out.println("Max num is : "+num3);
		}
	}
	public static void main(String[] args) {
		Max ch = new Max();
		ch.M1();
		ch.check();
		ch.M2();
		ch.check1();
	}

}
