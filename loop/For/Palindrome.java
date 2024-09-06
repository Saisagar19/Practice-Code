package loop.For;

public class Palindrome {
	public static void main(String[] args) {
		int num=313;
		int rev=0;
		int temp=num;
		for(int i=1;num!=0;i++)
		{
			int result=num%10;
			
			rev=(rev*10)+result;
			num=num/10;


		}
		if(temp==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not Palindrome");
		}
	}

}
