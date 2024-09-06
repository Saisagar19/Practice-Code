package com.Selection_state;

public class Min_No {
	public static void main(String[] args) {
		
		int x=3;
		int y=7;
		int z=2;
		
		if(x<y&&x<z)
		{
			System.out.println("Min no. is "+x);
		}
		else if(y<z&&y<x)
		{
			System.out.println("Min no. is "+y);
		}
		else {
			System.out.println("Min no. is "+z);
		}
	}

}
