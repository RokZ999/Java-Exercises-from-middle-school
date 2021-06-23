package vaje0;

import java.util.Arrays;
import java.util.Random;

public class X6v1 {
	public static void main(String[] args) 
	{
		System.out.println("27. Iskanje od A do Ž. (Robustna)");
		int[] arr = new Random().ints(1000,0,10000).toArray();
		System.out.println(Arrays.toString(arr));
		System.out.printf("Robustno checker: %d == %d%n", 371,jeRobustno(371));
		System.out.printf(Arrays.toString(generator(arr)));
	}
	static int[] generator(int[] arr)
	{
		int[] arr2 = {};
		for(int i:arr)
			if(i==jeRobustno(i))
			{
				arr2 = Arrays.copyOf(arr2,arr2.length+1);
				arr2[arr2.length-1] = i;
			}
		return arr2;
	}
	static int jeRobustno(int vnos)
	{
		int dolzina=String.valueOf(vnos).length(),vsota=0;
		for(;vnos!=0;vnos/=10)
			vsota+=(int)Math.pow(vnos%10, dolzina);
		return vsota;
	}
}
