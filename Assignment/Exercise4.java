package pdf4;

public class Exercise4 {
	
	boolean a=true;
	
	void Check()
	{
		if(a==true)
		{
			a=false;
			System.out.println("The boolean value is: "+a);
		}
	}
	
	public static void main(String[] args) {
		Exercise4 obj=new Exercise4();
		obj.Check();
		System.out.println(obj.a);
	}
	

}
