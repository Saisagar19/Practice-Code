package sat0903;

public class Dup_Array {
	public void Array()
	{
		int a[]= {1,2,1,6,4,6,5,8,4};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					System.out.println(a[j]);
				}
			}	
		}
		System.out.println("Duplicate number count: "+count);
	}
	public static void main(String[] args) {
		Dup_Array n = new Dup_Array();
		n.Array();
	}
}
