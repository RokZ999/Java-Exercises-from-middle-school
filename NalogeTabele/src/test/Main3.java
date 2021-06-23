package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) 
	{
		char smer = ' ';
		Scanner in = new Scanner(System.in);
		System.out.println("Program za izpis premik.%n");
		System.out.print("Vnesite velikost tabele: ");
		int[] tabela = new int[in.nextInt()];
		for(int i=0;i<tabela.length;i++)
		{
			System.out.printf("Vnesite vrednost za tabelo[%d]: ", i);
			tabela[i] = in.nextInt();
		}
		System.out.print("Vnesite smer premika (D za desno L za levo): ");
		smer = in.next().charAt(0);
		System.out.print("Vnesite velikost premika (npr. 2): ");
		premik(tabela, in.nextInt(), smer);
		in.close();
		System.out.print(Arrays.toString(tabela));
		
	}
	static void premik(int[] tabela,int premik, char smer) 
	{
		if( smer=='D') 
			premikD(premik, tabela);
		else
			premikL(premik, tabela);
	}
	static void premikD(int velikost,int[] arr)
	{	
		int[] kopija = Arrays.copyOf(arr, arr.length);
		int i=0,i2;
		for(;i<arr.length-velikost;i++) //0<3
			arr[i+velikost]=kopija[i];
		for(i2=i,i=0;i<velikost;i++,i2++)
			arr[i]=kopija[i2];
		
	}
	static void premikL(int velikost,int[] arr)
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
