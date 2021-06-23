package vaje0;

import java.util.Arrays;
import java.util.Random;

public class X6v3 {
	public static void main(String[] args) 
	{
		System.out.println("27. Iskanje od A do Ž. (SuperDvomestno)");
		int[] arr = new Random().ints(1000,0,10000).toArray();
		System.out.println(Arrays.toString(arr));
		System.out.printf("Sdvomoestno checker: %d == %d%n", 59,sDvo(59));
		System.out.printf(Arrays.toString(generator(arr)));
	}
	static int[] generator(int[] arr)
	{
		int[] arr2 = {};
		for(int i:arr)
			if(i==sDvo(i))
			{
				arr2 = Arrays.copyOf(arr2,arr2.length+1);
				arr2[arr2.length-1] = i;
			}
		return arr2;
	}
	static int sDvo(int vnos)
	{
	
		int vsota=0,zmnozek=1;
		for(;vnos!=0;vnos/=10)
		{
			zmnozek*=vnos%10;
			vsota+=vnos%10;
		}		
		return vsota+zmnozek;
	}
}
