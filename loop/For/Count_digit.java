package loop.For;

public class Count_digit {
	public static void main(String[] args) {
		int count=0;
		int num=4235;
		for(int i=1;num!=0;i++)
		{
			int result=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);
	}
}
