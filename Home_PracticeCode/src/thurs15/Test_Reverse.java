package thurs15;

import java.util.Scanner;

public class Test_Reverse {
	public static void main(String[] args) {
		
		Reverse r = new Reverse();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		
		r.rev(n);
	}

}
