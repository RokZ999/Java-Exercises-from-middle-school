package vaje0;

import java.util.Arrays;
import java.util.Random;

public class X7 {
	public static void main(String[] args) 
	{
		System.out.println("28.Pretvarjanje 10->2");
		double[] arr = new Random().doubles(10,100,1000).toArray();
		System.out.println("Tabela z 10 vrednostmi: " + Arrays.toString(arr));
		System.out.println("Tabela z 2 vrednostmi: "+ Arrays.toString(pretvornik10v12(arr)) );
	}
	static String[] pretvornik10v12(double[] arr)
	{
		String[] arr2 = new String[arr.length];
		for(int i=0;i<arr.length;i++)
			{
				arr2[i] = Integer.toBinaryString((int)arr[i]);
			}
		return arr2;
	}
}
