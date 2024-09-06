package loop.For;

public class Square_of_even_no {
	public static void main(String[] args) {

		int square=0;
		for(int i=20;i<=60;i++)
		{
			if(i%2==0)
			{
				square=i*i;
				System.out.println(square);
			}
		}
	}
}
