package loop.For;

public class Even_Sqr_and_Odd_Cube {

	public static void main(String[] args) {
		int square=0;
		int cube=0;
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				square=i*i;
				System.out.println("Square of even "+i+"="+square);
			}
			else
			{
				cube=i*i*i;
				System.out.println("Cube of Odd "+i+"="+cube);
			}
		}
	}
}
