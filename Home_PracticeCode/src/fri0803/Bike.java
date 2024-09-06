package fri0803;

public class Bike extends Vehicle {
	
	@Override
	public void vehicleType(String S)
	{
		System.out.println(S);
	}
	public void fuelType(String n)
	{
		System.out.println(n);
	}
	public void noOfWheels(int wheels)
	{
		System.out.println(wheels);
	}

}
