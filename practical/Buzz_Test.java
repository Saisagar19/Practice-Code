package practical;

import java.util.Scanner;

public class Buzz_Test {
	public static void main(String[] args) {
		
		Buzz_no b= new Buzz_no();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A number: ");
		int n=sc.nextInt();
		b.m1(n);
	}

}
