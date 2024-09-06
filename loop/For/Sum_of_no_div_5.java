package loop.For;

public class Sum_of_no_div_5 {
	public static void main(String[] args) {
		
		int count=0;
		for(int i=50;i<=100;i++)
		{
			if(i%5==0)
			{
				count++;
			}
		}System.out.println(count);
	}

}
