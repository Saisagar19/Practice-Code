package sat0903;

import java.util.Scanner;

public class Option extends MathOperation {

	public void ShowOptions()
	{
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
	}
	int n;
	public void Select()
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter option number: ");
		n=sc.nextInt();

		{
			switch (n) 
			{
			case 1: {
				Addition();
				break;
			}
			case 2:
			{
				Substraction();
				break;
			}
			case 3:
			{
				Multiplication();
				break;
			}
			case 4:
			{
				Division();
				break;
			}
			default:
			{
				System.out.println("Enter a Valid number");
				break;
			}

			}
		}
	}
}

