package vaje0;
import java.util.Arrays;
import java.util.Scanner;
public class W2 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("14. Najdi in premakni");
		int[] arr = new int[15];
		for(int i=0;i<15;i++)
		{
			System.out.printf("Vnesite vrednost za tabelo[%d]: ", i);
			arr[i] = in.nextInt();
		}
		int iskana=0;
		System.out.print("Vneseti poljubno celo število: ");
		iskana = in.nextInt();
		int[] kopija = arr.clone();
		premik(arr, iskana);
		System.out.printf("%s%n",  !(Arrays.toString(arr).equals(Arrays.toString(kopija))) ? Arrays.toString(arr) : "V tabeli ni bilo iskane vrednosti." );
		in.close();
	}
	static int[] premik(int[] arr,int iskana)
	{
		for(int i=0;i<arr.length && iskana!=0;i++)
			if(arr[i]==iskana)
			{
				int i2=i;
				while(i2<arr.length-1)
				{
					arr[i2] = arr[i2+1];
					i2++;
				}
				arr[arr.length-1]=0;
				i--;
			}
		return arr;
	}
}