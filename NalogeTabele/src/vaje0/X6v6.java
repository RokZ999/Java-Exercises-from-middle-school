package vaje0;

import java.util.Arrays;
import java.util.Random;

public class X6v6 {
	public static void main(String[] args) 
	{
		System.out.println("27. Iskanje od A do Ž. (Avtomatska)");
		int[] arr = new Random().ints(1000,0,10000).toArray();
		System.out.println(Arrays.toString(arr));
		System.out.printf("aVTOhecker: %d == %d%n", 25, auto(25));
		System.out.printf(Arrays.toString(generator(arr)));
	}
	static int[] generator(int[] arr)
	{
		int[] arr2 = {};
		for(int i:arr)
			if(i==auto(i))
			{
				arr2 = Arrays.copyOf(arr2,arr2.length+1);
				arr2[arr2.length-1] = i;
			}
		return arr2;
	}
	static int auto(int vnos)
	{
	return (vnos*vnos)%(int)Math.pow(10, String.valueOf(vnos).length());
	}
}
