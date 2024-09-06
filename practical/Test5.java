package practical;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Sum_of_Digit s1=new Sum_of_Digit();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		s1.sum(n);
	
	}

}
