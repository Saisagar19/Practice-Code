package tue1203;

import java.util.Scanner;

public class Palindrome {
	
	String s;
	
	public void Accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String: ");
		s=sc.next();
		
	}
	public void Check()
	{
		int length=s.length();
		String rev="";
		
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("palindrome ");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		p.Accept();
		p.Check();
	}

}
