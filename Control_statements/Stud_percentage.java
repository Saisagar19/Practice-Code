package com.Selection_state;

public class Stud_percentage {
	public static void main(String[] args) {
		
		String Name= "Sagar";
		int sub=3;
		float eng =78.55f;
		float math=88.55f;
		float marathi=68.55f;
		
			
		float total = (eng+math+marathi);
		
		float per =(total/300)*100;
		System.out.println("Name: " +Name);
		System.out.println("total Marks: " +total);
		System.out.println("Percentage: " +per);
		if(per>=35)
		{
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}	
	}
}
