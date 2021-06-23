package vaje0;

import java.util.Arrays;

public class X0 {
	public static void main(String[] args) {
		System.out.println("22. Polovička");
		int[] arr = {1,2,3,4,5,6,7,8};
		izpisPolovicke(arr);
	}
	static void izpisPolovicke(int[] arr)
	{
		for(int i=0;i<arr.length/2;i++)
			arr[i] = arr[i+i]+arr[i+i+1];
		arr= Arrays.copyOf(arr, arr.length/2);
		System.out.println(Arrays.toString(arr));
	}
}
