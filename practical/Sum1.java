package practical;

public class Sum1 {
	
	void M1(int n) 
	{
		int sum=0;
		for(;n!=0;)
		{
			int result=n%10;
			sum=result+sum;
			n=n/10;
		}
		
		System.out.println("Sum of Digit: "+sum);
	}

}
