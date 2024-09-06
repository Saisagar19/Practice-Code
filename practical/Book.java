package practical;

import java.util.Scanner;

public class Book {
	
	public void Name(String N)
	{
		
		System.out.println(N);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Book name: ");
		String s=sc.next();
		
		Book B = new Book();
		B.Name(s);
		
		
	}

}
