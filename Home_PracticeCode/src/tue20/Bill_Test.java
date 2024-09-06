package tue20;

import java.util.Scanner;

public class Bill_Test {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Unit: ");
		int u=sc.nextInt();
		Electric_Bill E = new Electric_Bill(u);
		System.out.println(E.getUnits());
		System.out.println("bill Calculation: "+E.CalculateBill());
		
	}

}
