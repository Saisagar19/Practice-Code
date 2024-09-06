package logical;

public class Swap {

	public void m1()
	{
		int a=5;
		int b=7;
		int temp=b;
		b=a;
		a=temp;
		
		System.out.println(a);
		System.out.println(b);
	}
	public void m2()
	{
		int i=4;
		int j=5;
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println(i);
		System.out.println(j);
		
	
	}
	public static void main(String[] args) {
		Swap S=new Swap();
		S.m1();
		System.out.println();
		S.m2();
		
	}
}
