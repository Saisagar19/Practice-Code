package sat0903;

public class A implements Maths {

	@Override
	public void square(int y) {
		int z=y*y;
		System.out.println("Square: "+z);
		
	}

	@Override
	public void cube(int y) {
		int z=y*y*y;
		System.out.println("Cube: "+z);
		
	}

	@Override
	public void calculatePower(int b, int p) {
		
	int multi=1;
	for(int i=1;i<=p;i++)
	{
		multi=multi*b;
	}
	System.out.println(multi);
		
	}
	public static void main(String[] args) {
		A a = new A();
		a.square(2);
		a.cube(3);
		a.calculatePower(2, 2);
	}

}
