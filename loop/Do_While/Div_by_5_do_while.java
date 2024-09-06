package loop.Do_While;

public class Div_by_5_do_while {
	public static void main(String[] args) {

		int n=10;
		int i=1;

		do{
			if(i%5==0)
			{
				System.out.println(+i+" is div by 5");
			}
			else
			{
				System.out.println(+i+" is not div by 5");
			}
			i++;

		}while(i<=n);
	}

}



