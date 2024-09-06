package com.Selection_state;

import java.util.Scanner;

public class Week_Days {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Day: ");
		String week= sc.next();
		
		
		switch(week)
		{
			case "mon":
				System.out.println("monday");
				break;
			case "tue":
				System.out.println("tuesday");
				break;
				case "wed":
					System.out.println("Wednesday");
					break;
					case "thur":
						System.out.println("thursday");
						break;
						case "fri":
							System.out.println("Friday");
							break;
							case "sat":
								System.out.println("Saturday");
								break;
							case "sun":
								System.out.println("Sunday");
								break;
							default:
								System.out.println("not a day");
								break;
		}
	}

}
