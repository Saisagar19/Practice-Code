package loop.Do_While;

import java.util.Scanner;

public class Do_While_Div_2 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int n=sc.nextInt();
		int i=0;
		do {
			if(i%2==0)
			{
				n++;
				System.out.println(i);
			}
			i++;
		}while(i<=n);
	}

}
