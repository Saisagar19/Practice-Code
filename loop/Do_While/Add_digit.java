package loop.Do_While;

public class Add_digit {

	public static void main(String[] args) {
		
		int num=1115;
		int i=1;
		int sum=0;
		do {
			int result=num%10;
			sum=result+sum;
			num=num/10;
			
			i++;
			
		}while(num!=0);
		System.out.println(sum);
	}
}
