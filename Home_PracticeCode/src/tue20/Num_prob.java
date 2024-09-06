package tue20;

public class Num_prob {
	int temp=0;
	public void m1(int num)
	{	
		
		int result=num%10;
		num=num/10;
		temp=num;
		if(result<5)
		{
			temp=temp*10;
			System.out.println(temp);
		}
		
		else if(result>=5)
		{
			temp=(temp*10)+5;
			System.out.println(temp);
		}
		
	}

}
