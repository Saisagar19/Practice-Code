package looping;

public class CountDigit {

	public static void main(String[] args) {
		
		int num =65431;
		int cnt=0;
		
		while(num!=0)
		{
			int res=num%10;
			if(res%2==0)
			cnt++;
			num=num/10;
			
		}
		System.out.println("Count digit: "+cnt);
	}
}
