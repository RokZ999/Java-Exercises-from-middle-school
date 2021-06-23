package vaje0;

import java.util.Arrays;
import java.util.Random;

public class X6v4 {
	public static void main(String[] args) 
	{
		System.out.println("27. Iskanje od A do Ž. (Fatalno)");
		int[] arr = new Random().ints(1000,0,10000).toArray();
		System.out.println(Arrays.toString(arr));
		System.out.printf("Fatalnochecker: %d == %d%n", 36, fatalno(36));
		System.out.printf(Arrays.toString(generator(arr)));
	}
	static int[] generator(int[] arr)
	{
		int[] arr2 = {};
		for(int i:arr)
			if(i%fatalno(i)==0)
			{
				arr2 = Arrays.copyOf(arr2,arr2.length+1);
				arr2[arr2.length-1] = i;
			}
		return arr2;
	}
	static int fatalno(int vnos)
	{
	
		int vsota=0;
		for(;vnos!=0;vnos/=10)
		{
			vsota+=vnos%10;
		}
		if (vsota==0) return 10001;
		return vsota;
	}
}
