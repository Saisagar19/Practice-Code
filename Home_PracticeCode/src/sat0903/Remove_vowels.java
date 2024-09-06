package sat0903;

import java.util.Scanner;

public class Remove_vowels {

	public void Remove()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter input: ");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				continue;

			}	
			else
			{

				System.out.print(s.charAt(i));
			}
		}

	}
}
