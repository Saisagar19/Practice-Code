package loop.For;

public class Odd_Add {
	public static void main(String[] args) {
		
		int result=0;
		for(int i=20;i<=30;i++)
		{
			if(i%2!=0)
			{
				 result=i+result;
			}
		}
		System.out.println(result);
	}

}
