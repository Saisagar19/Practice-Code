package loop.For;

import java.util.Scanner;

public class Divisible_By_2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				n++;
				System.out.println(i);
			}


		}
	}


}
