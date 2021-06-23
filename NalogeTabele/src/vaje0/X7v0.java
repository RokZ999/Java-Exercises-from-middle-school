package vaje0;

import java.util.Arrays;
import java.util.Random;

public class X7v0 {
	public static void main(String[] args) 
	{
		System.out.println("28.Pretvarjanje 2->10");
		double[] arr = new Random().doubles(10,100,1000).toArray();
		System.out.println("Tabela z 2 vrednostmi: " + Arrays.toString(arr));
		System.out.println("Tabela z 10 vrednostmi: "+ Arrays.toString(pretvornik2v10(pretvornik10v12(arr))));
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
	static double[] pretvornik2v10(String[] arr)
	{
		double[] arr2 = new double[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr2[i] = Integer.parseInt(arr[i], 2);
		}
		return arr2;
	}
}
