package fri0803;

public class Main_3 {
	public static void main(String[] args) {

		Vehicle C=new Car();
		C.vehicleType("Pagani");
		C.fuelType("Diesel");
		C.noOfWheels(4);
		
		Vehicle C1=new Bike();
		C1.vehicleType("Sport");
		C1.fuelType("Petrol");
		C1.noOfWheels(2);
		
		Vehicle C2=new AutoRikshaw();
		C2.vehicleType("Local");
		C2.fuelType("CNG");
		C2.noOfWheels(3);
		
	
	}
}
