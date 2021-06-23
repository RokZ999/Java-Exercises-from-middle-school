package vaje0;
import java.util.Arrays;
import java.util.Scanner;
public class W9
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("21.Združevanje tabel");
		int[] arr1,arr2;
		System.out.print("Vnesite velikost 1. Tabele: ");
		int velikost = in.nextInt();
		arr1 = new int[velikost];
		System.out.printf("Vnesite %d vrednosti (primer za 3 vrednosti (1 2 3): ",velikost );
		for(int i=0;i<velikost;i++)
			arr1[i] = in.nextInt();
		System.out.print("Vnesite velikost 2. Tabele: ");
		velikost = in.nextInt();
		arr2 = new int[velikost];
		System.out.printf("Vnesite %d vrednosti (primer za 3 vrednosti (1 2 3): ",velikost );
		for(int i=0;i<velikost;i++)
			arr2[i] = in.nextInt();
		razlikaVsota(arr1, arr1.length, arr2, arr2.length);
	}
	static void razlikaVsota(int[] arr, int velikost,int[] arr2, int velikost2)
	{
		velikost = velikost<velikost2 ? velikost2 : velikost;
		int[] arr3 = new int[velikost];
		int[] arr4 = new int[velikost];
		for(int i=0;i<arr4.length;i++)
		{
			arr3[i]=arr[i]+arr2[i];
			arr4[i]=arr[i]-arr2[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	}
}