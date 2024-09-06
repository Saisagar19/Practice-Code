package loop.While;

public class Div_5_while {
	public static void main(String[] args) {
		
		int n=10;
		int i=1;
		while(i<=n)
		{
			if(i%5==0)
			{
				System.out.println(+i+" is div by 5");
			}
			else
			{
				System.out.println(+i+" is not div by 5");
			}
			i++;
			
		}
	}

}
