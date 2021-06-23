package vaje0;
import java.util.Arrays;
import java.util.Scanner;
public class W4v0{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("17.	Polnjenje tabele od spodaj navzgor");
		System.out.print("Vnesite velikost tabele: ");
		int[] arr = new int[in.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.printf("Vnesite vrednost za tabelo[%d]: ", i);
			arr[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(premik(arr)));
		in.close();
	}
	static int[] premik(int[] arr)
	{
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		return arr;
	}
}