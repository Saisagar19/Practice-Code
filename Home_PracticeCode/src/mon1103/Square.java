package mon1103;

public class Square extends Rectangle 
{

	public Square(double side)
	{
		super(side,side);
		double area=side*side;
		System.out.println("Area of Square: "+area);
		
		double perimeter=4*side;
		System.out.println("Perimeter of Square: "+perimeter);
		
	}


}


