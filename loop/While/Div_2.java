package loop.While;

import java.util.Scanner;

public class Div_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		
		int i=0;
		while(i<=n)
		{
			if(i%2==0)
			{
				n++;
				System.out.println(i);
				
			}
			i++;
		}
		
	}
}
