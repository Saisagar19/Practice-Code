package fri0803;

public class ShowUnicode {
	public void M1()
	{
		char x='A';
		char y='Z';
		for(int i=(int)x;i<=(int)y;i++)
		{
			System.out.println(i);
		}
	
	}
	public void M2()
	{
		char x='a';
		char y='z';
		for(int i=(int)x;i<=(int)y;i++)
		{
			System.out.println(i);
		}
	
	}
	public static void main(String[] args) {
		ShowUnicode sh = new ShowUnicode();
		System.out.println("unicode from 'A' to 'Z' ");
		sh.M1();
		System.out.println("unicode from 'a' to 'z' ");
		sh.M2();
	}
	

}
