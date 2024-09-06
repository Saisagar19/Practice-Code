package sort;

public class Array_Accending {

	public static void main(String[] args) {

		int c = 0;  
		int y[] = new int [] {5, -1, 0, 2, 6};     
		  
		System.out.println("array: ");    
		for (int i = 0; i < y.length; i++) 
		{     
			System.out.print(y[i] + ","); 
		}
		for(int i=0;i<y.length;i++)
		{
			for(int j=i+1;j<y.length;j++)
			{
				if(y[i]>y[j])
				{
					c = y[i];    
					y[i] = y[j];    
					y[j] = c;
				}
			}
		}
		System.out.println();
		System.out.println("Sorted Array: ");
		for (int i = 0; i < y.length; i++) 
		{     
			System.out.print(y[i] + " ");    
		}    
	}
}
