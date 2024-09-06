package sort;
import java.util.Scanner;  
public class Array_1  
{  
	public static void main(String[] args)   
	{  

		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter no: ");  
		int n1=sc.nextInt();  
		int[] array = new int[10];  
		
		System.out.println("Enter Array Element : ");  
		
		for(int i=0; i<n1; i++)  
		{  
			array[i]=sc.nextInt();  
		}  
		System.out.println("Array: ");  

		for (int i=0; i<n1; i++)   
		{  
			System.out.print(array[i]+",");  
		}  
	}  
}