package count;

public class Cube_Even {
	public static void main(String[] args) {


		int cube=0;

		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				cube=i*i*i;
				System.out.println(cube);
			}
		}
	}
}

