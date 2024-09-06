package loop.For;
//******logic******
public class Reverse_no {

	public static void main(String[] args) {
		int num=352;
		int result=0;
		int temp;

		for(int i=1;num!=0;i++)
		{
			result=num%10;
			num=num/10;
			temp=result;
			System.out.print(temp);
		}
	}
}
