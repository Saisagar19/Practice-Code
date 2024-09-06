package fri0803;

public class Dolt {
	public void M1(String s)
	{
		int count=0;
		System.out.println("length of String : "+s.length());
		for(int i=0;i<s.length();i++)
		{	
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u') 
			{
				count++;
			}

		}
		System.out.println("No. of vowels letters in a String:  "+count);
	}
	public void M2(String f)
	{
		int cnt= 0;
		System.out.println("length of String : "+f.length());
		for(int i=0;i<f.length();i++)
		{
			if(f.charAt(i)==' ')
			{
				cnt++;
			}
		}
		System.out.println("No. of vowels letters in a String:  "+cnt);
	}
	public static void main(String[] args) {

		Dolt d=new Dolt();
		d.M1("Hello there ");
		d.M2("how you doing");
	}

}
