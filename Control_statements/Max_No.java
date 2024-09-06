package com.Selection_state;

public class Max_No {
	public static void main(String[] args) {
		
		int x=3;
		int y=7;
		int z=8;
		
		if(x>y&&x>z)
		{
			System.out.println("Max no. is "+x);
		}
		else if(y>z&&y>x)
		{
			System.out.println("Max no. is "+y);
		}
		else {
			System.out.println("max no. is "+z);
		}
	}

}
