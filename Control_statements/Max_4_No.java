package com.Selection_state;

public class Max_4_No {
	public static void main(String[] args) {
		
		int w=13;
		int x=3;
		int y=7;
		int z=88;
		
		
		if(x>y&&x>z&&x>w)
		{
			System.out.println("Max no. is "+x);
		}
		else if(y>z&&y>x&&y>w)
		{
			System.out.println("Max no. is "+y);
		}
		else if(z>x&&z>y&&z>w) {
			System.out.println("max no. is "+z);
		}
		else {
			System.out.println("max no. is "+w);
		}
	}

}
