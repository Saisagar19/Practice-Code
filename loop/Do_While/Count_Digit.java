package loop.Do_While;

public class Count_Digit {
	public static void main(String[] args) {

		int count=0;
		int num=32546;
		int i=1;
		do
		{
			int result=num%10;
			count++;
			num=num/10;

			i++;

		}while(num!=0);
		System.out.println(count);
	}
}
