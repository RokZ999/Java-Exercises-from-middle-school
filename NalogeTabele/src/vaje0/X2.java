package vaje0;
public class X2 {
	public static void main(String[] args) {
		System.out.println("24.	Na sodih indeksih");
		int[] arr = {12, 17, 17, 5, 3,12};
		samoSoda(arr);
	}
	static void samoSoda(int[] arr)
	{
		out:
		for(int i=0;i<arr.length;i+=2)
		{
			for(int i2=i+1;i2<arr.length;i2++)
				if(arr[i] == arr[i2]) continue out;
			System.out.printf("%d ", arr[i]);
		}
	}
}
