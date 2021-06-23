package vaje0;

import java.util.Arrays;
import java.util.Random;

public class X6 {
	public static void main(String[] args) 
	{
		System.out.println("27. Iskanje od A do Ž. (Praštevila)");
		int[] arr = new Random().ints(1000,0,10000).toArray();
		System.out.println(Arrays.toString(arr));
		System.out.printf(Arrays.toString(generator(arr)));
	}
	static int[] generator(int[] arr)
	{
		int[] arr2 = {};
		for(int i:arr)
			if(jePra(i))
			{
				arr2 = Arrays.copyOf(arr2,arr2.length+1);
				arr2[arr2.length-1] = i;
			}
		return arr2;
	}
	static boolean jePra(int vnos)
	{
		for(int stevec=2;stevec<=vnos/2;stevec++)
			if(vnos%stevec==0) return false;
		return true;
	}
}
