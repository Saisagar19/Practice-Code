package looping;

public class SumOfOdd {
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=20;i<=30;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
				System.out.println(i);
			}
		}
		System.out.println("--------");
		System.out.println(sum);
	}

}
