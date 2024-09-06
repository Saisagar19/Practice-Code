package logical.loops;

public class Number_printing {

	public void M1()
	{
		System.out.println("Print 1 to 10 numbers");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	public void M2()
	{
		System.out.println("Print 100 to 1 numbers");
		for(int i=100;i>=1;i--)
		{
			System.out.println(i);
		}
	}
	public void M3() {
		System.out.println("Print 1 to 10  even numbers only");

		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	public void M4() {
		System.out.println("Print 1 to 10  odd numbers only");

		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}

	}
	public void M5() {
		System.out.println("Print sum of 1 to 10  even numbers only");
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{	
				sum=sum+i;
			}

		}
		System.out.println("Even num. sum: "+sum);

	}
	public void M6() {
		System.out.println("Print sum of 1 to 10  even number and 1 to 10 odd number");
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{	
				sum=sum+i;
			}

		}
		System.out.println("Even No. Sum: "+sum);
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{	
				sum=sum+i;
			}

		}
		System.out.println("Odd No. Sum: "+sum);
	}

	public static void main(String[] args) {
		Number_printing N = new Number_printing();
		N.M1();
		System.out.println("..............");
		N.M2();
		System.out.println("..............");
		N.M3();
		System.out.println("..............");
		N.M4();
		System.out.println("..............");
		N.M5();
		System.out.println("..............");
		N.M6();


	}
}
