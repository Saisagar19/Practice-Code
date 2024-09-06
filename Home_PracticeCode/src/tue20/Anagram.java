package tue20;

public class Anagram {
	String s1;
	String s2;
	public void check1(String s1)
	{
		int sum=0;
		for(int i=0;i<s1.length();i++) 
		{
		int code=s1.codePointAt(i);
		sum=sum+code;
		}
		
	}
	public void check2(String s2)
	{
		int sum=0;
		for(int i=0;i<s2.length();i++) 
		{
		int code=s2.codePointAt(i);
		sum=sum+code;
		}
	
	}
	public void Display()
	{
		if(s1==s2)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}
	}

}


