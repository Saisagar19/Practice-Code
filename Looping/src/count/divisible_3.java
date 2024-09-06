package count;

public class divisible_3 {
	public static void main(String[] args) {
		
		int count=0;
		
		for(int i=300;i<=350;i++)
		{
			if(i%3==0)
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("------");
		System.out.println(count);
	}

}
