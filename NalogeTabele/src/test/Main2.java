package test;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Program za izpis zaporedja.%n");
		System.out.print("Vnesite velikost tabele: ");
		int[] test = {10,1,11,3,12,4,13,5};
		int[] tabela = new int[in.nextInt()];
		for(int i=0;i<tabela.length;i++)
		{
			System.out.printf("Vnesite vrednost za tabelo[%d]: ", i);
			tabela[i] = in.nextInt();
		}
		in.close();
		zaporedje(test);
	}
	static void zaporedje(int[] tabela) 
	{
		for(int i=tabela.length-2;i>=0;i-=2)
			for(int i2=0;i2<tabela[i+1];i2++)
				System.out.printf("%d ", tabela[i]);
		
	}
}
