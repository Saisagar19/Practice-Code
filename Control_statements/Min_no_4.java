package com.Selection_state;

public class Min_no_4 {
	public static void main(String[] args) {
		
		int w=13;
		int x=3;
		int y=7;
		int z=88;
		
		
		if(x<y&&x<z&&x<w)
		{
			System.out.println("Min no. is "+x);
		}
		else if(y<z&&y<x&&y<w)
		{
			System.out.println("Min no. is "+y);
		}
		else if(z<x&&z<y&&z<w) {
			System.out.println("min no. is "+z);
		}
		else {
			System.out.println("min no. is "+w);
		}
	}

}
