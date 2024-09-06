package sat0903;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Voter {
	int n;
	int c;
	public void Vote()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Age: ");

		try {
			c=sc.nextInt();

			if(c<18)
			{
				throw new userException();

			}
			else
			{
				System.out.println("You can vote");
			}


		} catch ( InputMismatchException e) {
			System.out.println(e);

		}
		catch(userException d)
		{
			d.showError();
			d.getMessage();
		}
	}

}
