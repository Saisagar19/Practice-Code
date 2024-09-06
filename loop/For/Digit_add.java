package loop.For;

public class Digit_add {

	public static void main(String[] args) {
		
		int num=123;
		int sum=0;
		for(int i=1;num!=0;i++)
		{
			int result=num%10;
			sum=sum+result;
			num=num/10;
			
		}
		System.out.println(sum);
	}
}
