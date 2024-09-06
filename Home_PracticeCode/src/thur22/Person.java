package thur22;

import java.util.Scanner;

public class Person {
	private String Name;
	private String Add;
	private String Email;
	private int age;
	private long mobno;

	public Person() {
	
		this.Name="Sagar";
		this.Add="Pune";
		this.Email="Sagar@gmail.com";
		
	}
	public Person(int age,long mobno)
	{
		this.age=age;
		this.mobno=mobno;
	}
	public void Accept(int age,long mobno)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter age: ");
		age=sc.nextInt();
		System.out.println("Enter Mob No: ");
		mobno=sc.nextLong();
		
	}
	public void Show()
	{
		System.out.println("Name: "+this.Name);
		System.out.println("Add: "+this.Add);
		System.out.println("Email: "+this.Email);
		Person p = new Person();
		p.Accept(age, mobno);
		
		
		
	}

}
