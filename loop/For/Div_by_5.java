package loop.For;

import java.util.Scanner;

public class Div_by_5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A no: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%5==0)
			{
				System.out.println(+i+" is Divisible by 5");
			}
			else
			{
				System.out.println(+i+" is Not Divisible by 5");
			}
		}
		
	}

}
