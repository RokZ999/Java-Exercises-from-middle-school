package vaje0;
	
public class X5 
{
	public static void main(String[] args) 
	{
		System.out.println("26. Interval");
		int[] arr = {4,5,6,7,15,21,22,23};
		izpisIntervala(arr);
	}
	static void izpisIntervala(int[] arr)
	{
		System.out.print(arr[0] + " ");
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]+1 == arr[i+1])
				continue;
			System.out.printf("%d%n%d ",arr[i],arr[i+1]);
		}
		System.out.print(arr[arr.length-1]);
	}
}
