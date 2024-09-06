package count;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int ft=0;
		int st=1;
		int tt;

		for(int i=1;i<=10;i++) {
			
			tt=ft+st;
			System.out.println(tt);
			ft=st;
			st=tt;
		}
	}
}
