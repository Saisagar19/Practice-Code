package sat0903;

import java.util.Scanner;

public class MathOperation {

	double num1;
	double num2;
	public void Accept_number()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num1: ");
		num1=sc.nextDouble();
		System.out.println("Enter num2: ");
		num2=sc.nextDouble();
	}
	public void Addition()

	{
		double add=num1+num2;
		System.out.println("Addition: "+add);
	}
	public void Substraction()

	{
		double sub=num1-num2;
		System.out.println("Substraction: "+sub);
	}
	public void Multiplication()

	{
		double  multi=num1*num2;
		System.out.println("Multiplication: "+multi);
	}
	public void Division()

	{
		double div=num1/num2;
		System.out.println("Divition: "+div);
	}
	
}
