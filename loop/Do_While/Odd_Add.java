package loop.Do_While;

public class Odd_Add {
	public static void main(String[] args) {
		int i=20;
		int result=0;
		
		do {
			if(i%2!=0)
			{
				result=i+result;
			}
			i++;
		}while(i<=30);
		System.out.println(result);

	}

}
