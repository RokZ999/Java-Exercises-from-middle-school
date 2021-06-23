package vaje0;

import java.util.Arrays;

public class X1 {
	public static void main(String[] args) {
		System.out.println("23.Transformacija tabele");
		int[] arr = {1};
		System.out.println(transform(arr) ?"Postopek je bil opravljen " + Arrays.toString(arr) : "Postopek ni bil opravljen.");
	}
	static boolean transform(int[] arr)
	{
		if(arr.length<2) return false;
		for(int i=0;i<arr.length/2;i++)
		{
			arr[i] += arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[i]- arr[arr.length-1-i];
			arr[i] -= arr[arr.length-1-i];
		}
		return true;
	}
}
