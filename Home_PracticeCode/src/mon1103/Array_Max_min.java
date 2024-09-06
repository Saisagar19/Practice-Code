package mon1103;

public class Array_Max_min
{
	public void Min()
	{
		int a[]={4,5,2,1,7};
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Min no: "+min);
		
		
	}
	public void Max()
	{
		int a[]={4,5,2,1,7};
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Max no: "+max);
		
		
	}
	
	public static void main(String[] args) {
		Array_Max_min n = new Array_Max_min();
		n.Min();
		n.Max();
	}


}
