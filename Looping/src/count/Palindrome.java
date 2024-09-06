package count;

public class Palindrome {

	public static void main(String[] args) {

		int num=636;
		int rev=0;
		int temp=num;
		while(num!=0)
		{
			int res=num%10;

			rev=(rev*10)+res;
			num=num/10;
		}
		if(rev==temp) {		
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}
}

