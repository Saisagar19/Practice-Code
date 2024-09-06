package tue20;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		Anagram A = new Anagram();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Word: ");
		String s=sc.next();
		String p=sc.next();
		
		A.check1(s);
		A.check2(p);
		A.Display();
		System.out.println();
		
	}


}
