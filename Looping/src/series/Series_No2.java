package series;

public class Series_No2 {
	//1,4,27,256,3125,........

	public static void main(String[] args) {
		int c;

		for(int i=1;i<=10;i++)
		{
			c=1;
			for(int j=1;j<=i;j++)
			{	
				c=c*i;

			}
			System.out.println(c);

		}
	}

}
