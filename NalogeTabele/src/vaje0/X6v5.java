package vaje0;

import java.util.Arrays;
import java.util.Random;

public class X6v5 {
	public static void main(String[] args) 
	{
		System.out.println("27. Iskanje od A do Ž. (Bombastična)");
		int[] arr = new Random().ints(1000,0,10000).toArray();
		System.out.println(Arrays.toString(arr));
		System.out.printf("Bombchecker: %d == %d%n", 135, bomb(135));
		System.out.printf(Arrays.toString(generator(arr)));
	}
	static int[] generator(int[] arr)
	{
		int[] arr2 = {};
		for(int i:arr)
			if(i==bomb(i))
			{
				arr2 = Arrays.copyOf(arr2,arr2.length+1);
				arr2[arr2.length-1] = i;
			}
		return arr2;
	}
	static int bomb(int vnos)
	{
	
		int vsota=0,stevec=String.valueOf(vnos).length();
		for(;vnos!=0;vnos/=10) 
			vsota+=(int)Math.pow(vnos%10, stevec--);


		return vsota;
	}
}
