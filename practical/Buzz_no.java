package practical;

public class Buzz_no {
	int temp=0;
	public void m1(int num)
	{
		if(num%7==0)
		{
			while(num!=0) 
			{
				int result=num%10;
				temp=result;
				num=num/10;
			}
			if(temp==7)
			{
				System.out.println("not Buzz No");
			}
			else
			{
				System.out.println("Buzz no");
			}
	
		}else
		{
			System.out.println("Not Divisible by 7");
		}
	
	}

}
