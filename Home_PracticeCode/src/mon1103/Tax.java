package mon1103;

import java.util.Scanner;

public class Tax {
	double salary;
	public void Accept_Salary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Gross Salary: ");
		salary=sc.nextDouble();
	}

	public void CalculateTax()
	{
		if(salary>0 && salary<=250000)
		{
			System.out.println("Tax rate: Nill");
			//System.out.println(": "+salary);
		}
		else if(salary>250001 && salary<=500000)
		{
			double tax=salary*0.05;
			//double salary1=salary+tax;
			System.out.println("Tax rate: "+tax);
			//System.out.println(": "+salary1);
		}

		else if(salary>500000 && salary<=1000000) {
			double tax=(salary *0.2)+12500;
			//salary=salary+tax;
			System.out.println("Tax rate: "+tax);
			//System.out.println(": "+salary);
		}
	
		else if(salary>1000000) {
			double tax=(salary *0.3)+125000;
			//salary=salary+tax;
			System.out.println("Tax rate: "+tax);
			//System.out.println(": "+salary);
		}
		
	}
	public static void main(String [] args)
	{
		Tax t=new Tax();
		t.Accept_Salary();
		t.CalculateTax();
		
	}
}
