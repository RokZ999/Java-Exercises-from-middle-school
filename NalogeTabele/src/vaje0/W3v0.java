package vaje0;
import java.util.Arrays;
import java.util.Scanner;
public class W3v0 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("16.	Polnjenje tabele od zgoraj navzdol brez odpadka");
		int[] arr = new int[5];
		int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		for(int i=6;i<5;i++)
		{
			System.out.printf("Vnesite vrednost za tabelo[%d]: ", i);
			arr[i] = in.nextInt();
		}
		System.out.print("Vnesite vrednost in index (primer: 5 2): ");
		premik(in.nextInt(),in.nextInt(), arr2);
		System.out.println(Arrays.toString(arr2));
		in.close();
	}
	static void premik(int x,int y,int[] arr)
	{
		for(int i=arr.length-1;i>=y;i--)
		{

			arr[i]=arr[i-1];
		}
		arr[y]=x;
	}
}