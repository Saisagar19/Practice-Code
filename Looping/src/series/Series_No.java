package series;

import java.util.Scanner;

public class Series_No {


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("1st case: 1,2,3,5...");
		System.out.println("2nd case: 2,4,6,8...");
		System.out.println("3rd case: 1,3,5,7...");
		System.out.println("4th case: 1,4,9,16...");
		System.out.println("5th case: 1,8,27,64...");
		System.out.println("enter Case Number :");
		int n =sc.nextInt();

		switch(n)
		{
		case 1:
		System.out.println("case 1 ");
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)		
		{
			if(num>=1)
				System.out.println("1st Case: "+i*1);
		}
		break;
		
		case 2:
			System.out.println("case 2 ");
			System.out.println("Enter Number :");
			int num1=sc.nextInt();
			for(int i=1;i<=num1;i++)		
			{
					System.out.println("2nd Case: "+i*2);
			}
			break;
			
		case 3:
			System.out.println("case 3 ");
			System.out.println("Enter Number :");
			int num2=sc.nextInt();
			for(int i=1;i<=num2*2;i+=2)		
			{
					System.out.println("3rd Case: "+i);
			}
			break;
			
		case 4:
			System.out.println("case 4 ");
			System.out.println("Enter Number :");
		int num3=sc.nextInt();
		for(int i=1;i<=num3;i++)		
		{
			System.out.println("4th Case: "+i*i);
		}
		break;
		
		case 5:
			System.out.println("case 5 ");
			System.out.println("Enter Number :");
			int num4=sc.nextInt();
			for(int i=1;i<=num4;i++)		
			{
				System.out.println("5th Case: "+i*i*i);
			}
		break;
		default:
			System.out.println("Not valid case");
			break;
		}


	}

}
