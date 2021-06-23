package vaje0;
import java.util.Arrays;
import java.util.Scanner;
public class W5v0{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("17.Polnjenje tabele od spodaj navzgor");
		int[] arr = new int[10];
	
		for(int i=0;i<10;i++)
		{
			System.out.printf("Vnesite vrednost za tabelo[%d]: ", i);
			arr[i] = in.nextInt();
		}
		System.out.print("Vnesite vrednost in index (primer: 5 2): ");
		premik(in.nextInt(),in.nextInt(), arr);
		System.out.println(Arrays.toString(arr));
		in.close();
	}
	static void premik(int x,int y,int[] arr)
	{
		for(int i=0;i<y;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[y]=x;
	}
}