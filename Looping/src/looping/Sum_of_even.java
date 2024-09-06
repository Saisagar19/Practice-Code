package looping;

public class Sum_of_even {

		public static void main(String[] args) {
			
			int num =65431;
			int sum=0;
			while(num!=0)
			{
				int res=num%10;
				if(res%2==0) {
				sum=sum+res;
				}
				num=num/10;
				
			}
			System.out.println(": "+sum);
		}
	}



