package fri0803;

public class AutoRikshaw extends Vehicle {
	
	@Override
	public void vehicleType(String S)
	{
		S="Local";
		System.out.println(S);
	}
	public void fuelType(String n)
	{
		n="CNG";
		System.out.println(n);
	}
	public void noOfWheels(int wheels)
	{
		wheels=3;
		System.out.println(wheels);
	}

}
