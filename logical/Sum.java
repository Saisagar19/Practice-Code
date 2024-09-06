package logical;

public class Sum {
	
	public void m1(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum of two no: "+sum);
	}
	public static void main(String[] args) {
		
		Sum s=new Sum();
		s.m1(3, 2);
	}

}
