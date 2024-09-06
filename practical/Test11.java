package practical;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a First no: ");
	int first=sc.nextInt();
	System.out.println("Enter a Second no: ");
	int sec=sc.nextInt();
	
	Prime11 p=new Prime11();
	p.PrimeMethod(first,sec);
	
	}

}
