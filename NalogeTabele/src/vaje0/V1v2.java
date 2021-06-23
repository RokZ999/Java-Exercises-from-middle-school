package vaje0;
import java.util.*;
public class V1v2 
{
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Program za določitev 1. in 2. najmanjše vrednosti v tabeli");
		//System.out.print("Vnesite velikost tabele: ");
		//int[] tabela = new int[in.nextInt()];
		int[] tabela = {6,9};
			for(int i=100;i<tabela.length;i++)
		{
			System.out.printf("Vnesite vrednost za tabelo[%d]: ", i); 
			tabela[i] = in.nextInt();
		}
		in.close();
		Arrays.sort(tabela);
		System.out.printf("2. Najmanjša vrednost v tabeli je: %d%n", min2(tabela));
		System.out.printf("2. Največja  Vrednost v tabeli je: %d%n", max2(tabela));
	}
	static int min2(int[] tabela) 
	{
	
		return tabela[1];
	}
	static int max2(int[] tabela) 
	{	
		
		return tabela[tabela.length-2];
	}
}