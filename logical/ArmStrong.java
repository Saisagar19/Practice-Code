package logical;

import java.util.Scanner;

public class ArmStrong {
	
	int n;

	
	public void Accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No: ");
		n=sc.nextInt();	
	}
	public void Armstrong()
	{
		int temp=n;
		int sum=0;
		
		int  cnt=0;
		while(n!=0)
		{
			n=n/10;
			cnt++;
		}
		//System.out.println(cnt);
		n=temp;
		while(n!=0)
		{
			int multi=1;
			int r=n%10;
			n=n/10;
			for(int i=1;i<=cnt;i++)
			{
				multi=r*multi;
			}
			sum=sum+multi;	
		}
		//System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("The number is ArmStrong");
		}
		else
		{
			System.out.println("The number is Not ArmStrong");
		}
	
		
	}
	public static void main(String[] args) {
		ArmStrong A = new ArmStrong();
		A.Accept();
		A.Armstrong();
		
	}
	
	

}
