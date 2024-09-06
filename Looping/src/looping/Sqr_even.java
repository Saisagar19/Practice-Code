package looping;

public class Sqr_even {

	public static void main(String[] args) {

		int num =65431;

		while(num!=0)
		{
			int res = num%10;
			if(res%2==0) 
			{
				System.out.println(res*res);
			}
			num=num/10;

		}
	}
}


