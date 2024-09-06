package loop.Do_While;

public class Reverse_no {

	public static void main(String[] args) {

		int i=1;
		int num=4256;
		int result=0;
		int temp;
		do
		{
			result=num%10;
			num=num/10;
			temp=result;
			i++;
			System.out.print(temp);
		}while(num!=0);
	}
}
