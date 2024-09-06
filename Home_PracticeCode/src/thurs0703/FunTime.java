package thurs0703;

public class FunTime {

	public int M1(int n )
	{
		int rev=0;
		while(n!=0)
		{
			int r=n%10;
			rev=(rev*10)+r;
			n=n/10;

		}
		return rev;

	}
	public static void main(String[] args) {
		FunTime F = new FunTime();
		System.out.println(F.M1(123));
	}
}
