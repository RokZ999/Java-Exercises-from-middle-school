package vaje0;

import java.util.Arrays;
import java.util.Random;

public class X6v0 {
	public static void main(String[] args) 
	{
		System.out.println("27. Iskanje od A do Ž. (Palindrom)");
		int[] arr = new Random().ints(1000,0,10000).toArray();
		System.out.println(Arrays.toString(arr));
		System.out.printf(Arrays.toString(generator(arr)));
	}
	static int[] generator(int[] arr)
	{
		int[] arr2 = {};
		for(int i:arr)
			if(i==jePali(i))
			{
				arr2 = Arrays.copyOf(arr2,arr2.length+1);
				arr2[arr2.length-1] = i;
			}
		return arr2;
	}
	static int jePali(int vnos)
	{
		int obrnjena=0;
		for(;vnos!=0;obrnjena=vnos%10+obrnjena*10,vnos/=10);
		return obrnjena;
	}
}