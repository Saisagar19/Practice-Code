package loop.Do_While;

public class Add_even {
	public static void main(String[] args) {
		
		int result=0;
		int i=10;
		do {
			if(i%2==0)
			{
				result=i+result;
			}
			i++;
		}while(i<=20);
		System.out.println(result);
	}
}		

