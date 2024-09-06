package logical;

public class Palindrom {
	public static void main(String[] args) {

		int n=123;
		int rev=0;
		int tmp=n;
		while(n!=0)
		{
			int res=n%10;
			rev=(rev*10)+res;
			n=n/10;
		}
		if(tmp==rev)
		{
			System.out.println("the number is palindrom");
		}
		else {
			System.out.println("the number is not palindrom");
		}
	}
}
