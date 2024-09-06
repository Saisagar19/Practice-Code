package practical;

public class Type_Conversion {
	
	public static void main(String[] args) {
		
		
		
		//byte>short>int>long>float>double
		
		int a=12;				//int to float
		float b=a;
		System.out.println(b);
		
		long b1=a;				//int to long
		System.out.println(b1);
		
		double d=a;				//int to double
		System.out.println(d);
		/*		
		float s=12.36f;				//Can not convert float to long
		long l=s;
		System.out.println(l);
		*/
		
		float s=12.36f;
		double f=s;					//float to double
		System.out.println(f);
		
		long h=12365;
		float m=h;					// long to float
		System.out.println(m);
		
		long k=568784;
		double j=k;					// long to double
		System.out.println(j);
		
		byte g=12;
		short p=g;					// byte to short
		System.out.println(p);
		
		short i=12454;
		int v=i;					// short to int
		System.out.println(v);
	}

}
