package vaje0;

import java.util.Arrays;
import java.util.Random;

public class X6v2 {
	public static void main(String[] args) 
	{
		System.out.println("27. Iskanje od A do Ž. (Močna)");
		int[] arr = new Random().ints(1000,0,10000).toArray();
		System.out.println(Arrays.toString(arr));
		System.out.printf("Mocno checker: %d == %d%n", 145,mocno(145));
		System.out.printf(Arrays.toString(generator(arr)));
	}
	static int[] generator(int[] arr)
	{
		int[] arr2 = {};
		for(int i:arr)
			if(i==mocno(i))
			{
				arr2 = Arrays.copyOf(arr2,arr2.length+1);
				arr2[arr2.length-1] = i;
			}
		return arr2;
	}
	static int mocno(int vnos)
	{
	
		int vsota=0,zmnozek=1;
		for(;vnos!=0;vnos/=10,zmnozek=1)
		{
			for(int stevec=vnos%10;stevec>1;stevec--)
				zmnozek*=stevec;
			vsota+=zmnozek;
		}		
		return vsota;
	}
}
