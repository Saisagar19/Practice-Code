package count;

public class Sqr_Cube 
{
	public static void main(String[] args) {
		int sqr=0;
		int cube=0;

		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				sqr=i*i;
				System.out.println("Even no.Square: "+sqr);
			}
			else 
			{
				cube=i*i*i;
				System.out.println("Even no.cube: "+cube);
			}


		}
	}

}
