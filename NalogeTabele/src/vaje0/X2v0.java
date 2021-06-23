package vaje0;
public class X2v0 {
	public static void main(String[] args) {
		System.out.println("24.	Na sodih indeksih");
		int[] arr = {12, 17, 17, 3, 5 };
		           //  S  L  S  L  S
		samoSoda(arr);
		samoLiha(arr);
		
	}
	static void samoSoda(int[] arr)
	{
		out:
		for(int i=0;i<arr.length;i+=2)
		{
			for(int i2=1;i2<arr.length;i2+=2)
				if(arr[i] == arr[i2]) continue out;
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}
	static void samoLiha(int[] arr)
	{
		out:
		for(int i=1;i<arr.length;i+=2)
		{
			for(int i2=0;i2<arr.length;i2+=2)
				if(arr[i] == arr[i2]) continue out;
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}
}
