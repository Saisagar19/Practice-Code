package loop.For;

public class Square_of_even_digit {
	public static void main(String[] args) {
		int num=52413;

		for(int i=1;num!=0;i++)
		{
			int result=num%10;
			if(result%2==0)
			{
				int square=result*result;
				System.out.println("From the digit even no. is "+result+" and square of that no. is "+square);
			}
			num=num/10;
		}
	}
}
