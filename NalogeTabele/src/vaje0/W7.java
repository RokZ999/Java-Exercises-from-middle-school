package vaje0;
import java.util.Arrays;
import java.util.Scanner;
public class W7
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("19. Pada narašča");
		int[] arr = {1,2,3,5,6,7};
		int[] arr2 = {1,2,9,3,5,6,7};
		
		System.out.printf("Tabela %s %s.%n",Arrays.toString(arr),aliNarasca(arr) ? "narasca" : "ne narasca");
		System.out.printf("Tabela %s %s.%n",Arrays.toString(arr2),aliNarasca(arr2) ? "narasca" : "ne narasca");
		in.close();
	}
	static boolean aliNarasca(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
			if(arr[i+1]<arr[i]) return false;
		return true;
	}
}