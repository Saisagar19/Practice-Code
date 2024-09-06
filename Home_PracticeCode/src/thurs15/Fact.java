package thurs15;

public class Fact {
	
	int fact=1;
	public void Fact(int f)
	{
		for(int i=1;i<=f;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
}
