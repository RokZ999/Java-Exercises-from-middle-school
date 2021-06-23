package vaje0;
import java.util.Arrays;
import java.util.Scanner;
public class W6v2{
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
		System.out.print("Vnesite velikost premika: ");
		premik(in.nextInt(), arr);
		System.out.println(Arrays.toString(arr));
		in.close();
	}
	// 1,2,3,4,5 
	static void premik(int velikost,int[] arr)
	{	//0,1,2,3,4
		//1,2,3,4,5
		//4,5,1,2,3
		int[] kopija = arr.clone();
		int i=0,i2;
		for(;i<arr.length-velikost;i++) //0<3
			arr[i+velikost]=kopija[i];
		for(i2=i,i=0;i<velikost;i++,i2++)
			arr[i]=kopija[i2];
		
	}
}
