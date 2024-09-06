package thurs0703;

public class Person {
	String Name;
	int age;
	
	public Person()
	{
		this.Name="Saisagar";
		this.age=21;
	}
	public Person(String N,int a)
	{
		this.Name=N;
		this.age=a;	
	}
	@Override
	public String toString() {
		return "Person [Name=" + this.Name + ", age=" + this.age + "]";
	
	}
}
