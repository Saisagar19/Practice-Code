package thurs0703;

public class Just {

	public void Add()
	{
		System.out.println("Addition: ");
	}
	public void Sub()
	{
		System.out.println("Substraction: ");
	}
	public void Mul()
	{
		System.out.println("Multiplication: ");
	}
	public void Add(int a,int b)
	{
		Add();
		int c=a+b;
		System.out.println(c);
	}
	public void Sub(int x,int y)
	{
		Sub();
		int z=x-y;
		System.out.println(z);
	}
	public void Mul(int p,int q)
	{
		Mul();
		int s=p*q;
		System.out.println(s);
	}

	
}
