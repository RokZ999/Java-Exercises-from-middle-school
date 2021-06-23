package test;

import java.util.Arrays;
import java.util.Random;

public class Main4 {
	public static void main(String[] args) 
	{
		System.out.println("Iskanje od A do Ž. (Bombastična)");
		int[] arr = new Random().ints(100,10,100000).toArray();
		System.out.println("Naše random vrednosti:" +Arrays.toString(arr));
		System.out.printf("Naše bobastične vrednosti:" +Arrays.toString(generator(arr)));
	}
	static int[] generator(int[] arr)
	{
		int[] arr2 = {};
		int zacasna=0;
		zunaj:
		for(int i:arr)
		{
			for(zacasna=i;zacasna!=0;zacasna/=10)
				if(zacasna%10==5) continue zunaj;
			if(i==bomb(i))
			{
				arr2 = Arrays.copyOf(arr2,arr2.length+1);
				arr2[arr2.length-1] = i;
			}
		}
		return arr2;
	}
	static int bomb(int vnos)
	{
	
		int vsota=0, zacasna=vnos,stevec=0;
		for(;zacasna!=0;zacasna/=10,stevec++);
		for(;vnos!=0;vnos/=10) 
			vsota+=(int)Math.pow(vnos%10, stevec--);
		return vsota;
	}
}
