package loop.Do_While;

public class Prime_Do_while {
	public static void main(String[] args) {
		int n=5;
		int count=0;
		int i=1;
		do
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}while(i<=5);
		if(count==2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("not prime");
		}


	}

}
