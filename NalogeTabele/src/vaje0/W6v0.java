package vaje0;
import java.util.Arrays;
import java.util.Scanner;
public class W6v0{
	static Scanner in = new Scanner(System.in);
	static final int velikost = 10;
	public static void main(String[] args) {
		System.out.println("18.Premik");
		int[] arr = new int[velikost];
	
		for(int i=0;i<10;i++)
		{
			System.out.printf("Vnesite vrednost za tabelo[%d]: ", i);
			arr[i] = in.nextInt();
		}
		premik(arr);
		System.out.println(Arrays.toString(arr));
		in.close();
	}
	static void premik(int[] arr)
	{
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length-1]=temp;
	}
}