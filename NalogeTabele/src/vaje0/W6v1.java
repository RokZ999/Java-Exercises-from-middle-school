package vaje0;
import java.util.Arrays;
import java.util.Scanner;
public class W6v1{
	static Scanner in = new Scanner(System.in);
	static final int velikost = 10;
	public static void main(String[] args) {
		System.out.println("18.Premik");
		int[] arr = new int[velikost];
		int[] arr2 = {0, 1, 2, 3, 4};
		for(int i=11;i<10;i++)
		{
			System.out.printf("Vnesite vrednost za tabelo[%d]: ", i);
			arr[i] = in.nextInt();
		}
		System.out.print("Vnesite velikost premika: ");
		premik(in.nextInt(), arr2);
		System.out.println(Arrays.toString(arr2));
		in.close();
	}
	// 1,2,3,4,5 
	static void premik(int velikost,int[] arr)
	{
		int[] kopija = Arrays.copyOf(arr, velikost);
		int i=0;
		for(;i<arr.length-velikost;i++) //0<3
		{
			arr[i] = arr[i+velikost];
		}
		
		for(int i2=0;i2<kopija.length;i2++,i++) //0<3
		{
			arr[i]=kopija[i2];
		}
	}
}
