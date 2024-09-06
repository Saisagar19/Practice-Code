package sat24;

public class Num_print {
	int count =0;
	public void m1()
	{
		int i=33;
		while(i<=77)
		{
			System.out.println(i);
			
			i++;
		}
		
	}
	public void m2()
	{
		for(int i=77;i>=33;i--)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	public void m3()

	{
		int i=33;
		while(i<=77)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
	public void m4()
	{
		for (int i=123;i<=459;i++)
		{
			if(i%7==0)
			{
				System.out.println(i);
			}
		}
	}
	public void m5()
	{
		for(int i=300;i<=550;i++)
		{
			if(i%6==0)
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
	public void m6()
	{
		for (int i=200;i>=-100;i--)
		{
			if(i%3==0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
	public void m7()
	{
		int sum=0;
		for(int i=4;i<=14;i++)
		{
			
				sum=i+sum;
			
			
		}
		System.out.println(sum);
	}
	public void m8()
	{
		long product=1;
		for(int i=55;i>=22;i--)
		{
			if(i%2==0)
			{
			product=i*product;
			}
		}
		System.out.println(product);
	}
	public int m9(int base,int power)
	{
		int result=1;
		int i=1;
		while(i<=power)
		{
			result=result*base;
			i++;
		}
		return result;
	}
	public void m10(int n)
	{
		int result=0;
		int i=1;
		while(n!=0)
		{
			 result=n%10;
			 System.out.println(result);
			 n=n/10;
		}
		
	}
	public void m11(int n)
	{
		int result=0;
		int count=0;
		while(n!=0)
		{
			 result=n%10;
			 count++;
			 n=n/10;
		}
		System.out.println(count);
	}
	public void m12(int n)
	{
		int result=0;
		int count=0;
		while(n!=0)
		{
			 result=n%10;
			 if(result%2!=0)
				{
					System.out.println(result);
				}
			 n=n/10;
		}
	}
	public void m13(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int result=n%10;
			sum=sum+result;
			n=n/10;
		}
		System.out.println(sum);
	}
	public void m14(int n)
	{
		int product=1;
		while(n!=0)
		{
			int result=n%10;
			if(result%2==0)
			{
				product=product*result;
				
			}
			n=n/10;
		}
		System.out.println(product);
	}
	public void m15(int n)
	{
		int rev=0;
		while (n!=0)
		{
			int result=n%10;
			rev=(rev*10)+result;
			n=n/10;
		}
		System.out.println(rev);
	}
	
	
}
