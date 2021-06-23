package vaje0;
public class X3 {
	public static void main(String[] args) 
	{
		System.out.println("25.	Sodi, lihi");
		int[] arr = {3, 4, 5, 5, 6, 3, 2, 7, 12 };
		           //  S  L  S  L  S
		System.out.print(sodaLihi(arr));
		
	}
	static boolean sodaLihi(int[] arr)
	{
		boolean stanje = true;
		for(int i=0;i<arr.length-1;i++)
		{
			if(i%2==0)
				if(arr[i]%2==1 && arr[i+1]%2==0)
					stanje=true;
				else
					return false;
			else
				if(arr[i]%2==0 && arr[i+1]%2==1)
					stanje=true;
				else
					return false;
		}
		return stanje;
	}
	
}
