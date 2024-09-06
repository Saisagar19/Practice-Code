package series;

public class Series_no3 {
//	1,-3,5,-7,,,,,
	public static void main(String[] args) {

		int n=10;
		int i=1;
		int j=1;
		for(int c=1;c<=n;c++)
		{
			if(j%2==0) 
			{
				System.out.println(-i+" ");
			}
			else {
				System.out.println(i+" ");
			}
			i+=2;
			j++;
		}
	}
}
