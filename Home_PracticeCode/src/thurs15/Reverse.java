package thurs15;

public class Reverse {
	
	public void rev(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int result=n%10;
			rev=(rev*10)+result;
			n=n/10;
		}
		System.out.println(rev);
	}

}
