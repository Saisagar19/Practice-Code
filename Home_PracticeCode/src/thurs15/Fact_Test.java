package thurs15;

import java.util.Scanner;

public class Fact_Test {
public static void main(String[] args) {
	
	Scanner sc= new Scanner (System.in);
	System.out.println("enter Number: ");
	int n=sc.nextInt();
	
	Fact f = new Fact();
	f.Fact(n);
	
}
}
