package mon1103;

import java.util.Scanner;

public class Rectangle {
	double length;
	double breadth;
	
	public Rectangle(double len,double bread)
	{
		this.length=len;
		this.breadth=bread;
		
	}
//	public void Accept(){
//		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Length: ");
//		length=sc.nextDouble();
//		System.out.println("Breadth: ");
//		breadth=sc.nextDouble();
//	}
//	
	public void Area()
	{
		double area;
		area= length*breadth;
		System.out.println("Area of Rectangle: "+area);
	}
	
	
	public void Perimeter()
	{
		double perimeter;
		perimeter=2*(length*breadth);
		System.out.println("Perimeter of Rectangle: "+perimeter);
		
	}

}
