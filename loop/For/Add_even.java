package loop.For;

public class Add_even {
	public static void main(String[] args) {

		int result=0;
		int j=0;
		for(int i=10;i<=20;i++)
		{
			if(i%2==0)
			{
				result=i+result;
			} 
		}
		System.out.println(result);
	}

}
