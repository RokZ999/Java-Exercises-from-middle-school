package vaje0;

import java.util.Arrays;
import java.util.Scanner;

public class X8 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int velikost = 0;
		System.out.println("29.	Cifro lov'c");
		System.out.print("Vnesite velikost tabele: ");
		velikost = in.nextInt();
		int[] arr = new int[velikost];
		System.out.printf("Vnesite %d stevila v obmocju 0-9 s presledki (primer za 4: 1 2 3 4): ",velikost);
		for(int i=0;i<velikost;i++)
			arr[i] = in.nextInt();
		playGame(arr);
		in.close();
	}
	static void playGame(int[] arr)
	{
		int x=0,y=0;
		do {
			System.out.print("Ugibajte vrednost X in Y: ");
			x=in.nextInt();
			y=in.nextInt();
			

			if(arr[y] == x)
			{
				for(int i=y;i<arr.length-1;i++)
					arr[i] = arr[i+1];
				arr = Arrays.copyOf(arr, arr.length-1);
				System.out.println(Arrays.toString(arr));
			}
			else
				System.out.println("Poskusite še enkrat.");
		}while(arr.length!=0);
		System.out.println("Uspelo vam je. :)");
	}
	
}
