package loop.Do_While;

public class Odd_do_while {
	public static void main(String[] args) {
		int i=1;
		do {
			if(i%2!=0)
			{
				System.out.println(+i+" is odd");
			}
			i++;
		}while(i<=10);
	}

}
