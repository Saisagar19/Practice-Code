package practical;

public class Sum_of_Digit {
	
	int sum=0;
	public void sum(int num)
	{
		for(;num!=0;)
		{
			int result=num%10;
			sum=result+sum;
			num=num/10;
		}
		System.out.println(sum);
	}

}
