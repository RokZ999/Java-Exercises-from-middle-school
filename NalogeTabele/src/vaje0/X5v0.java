package vaje0;
	
public class X5v0 
{
	public static void main(String[] args) 
	{
		System.out.println("26. Interval");
		int[] arr = {4, 7, 15, 15, 21, 23 };
		izpisIntervala(arr);
	}
	static void izpisIntervala(int[] arr)
	{
		for(int i=0;i<arr.length-1;i+=2)
		{
			for(int i2=arr[i];i2<=arr[i+1];i2++)
			{
				if(arr[i]==arr[i+1])
				{
					System.out.printf("%d %d" , i2,i2);
					break;
				}
				System.out.printf("%d " , i2);
			}
			System.out.println();
		}
	
	}
}
