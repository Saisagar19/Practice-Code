package count;

public class Divisible_5 {
	public static void main(String[] args) {
		
		int count=0;
		
		for(int i=50;i<=100;i++)
		{
			if(i%5==0)
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("------");
		System.out.println(count);
	}

}
