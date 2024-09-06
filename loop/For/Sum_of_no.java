package loop.For;

public class Sum_of_no {
	public static void main(String[] args) {

		int sum=0;
		for(int i=300;i<=350;i++)
		{
			if(i%3==0)
			{
				sum=sum+i;

			}

		}
		System.out.println(sum);
	}

}
