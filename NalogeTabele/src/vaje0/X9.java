package vaje0;
import java.util.Arrays;
import java.util.Scanner;
public class X9 {
	public static void main(String[] args) 
	{
		System.out.println("Program minolovec.");
		int i=0,velikost=0,poskusi=4,indeksUgiba=0, steviloX=0;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Vnesite velikost tabele: ");
		velikost = in.nextInt();
		char[] znaki = new char[velikost], vprsaji = new char[velikost]; 
		Arrays.fill(vprsaji, '?');
		
		for(;i<znaki.length;i++)
		{
			System.out.printf("Vnesite vrednost: ");
			znaki[i] = in.next().charAt(0);
			if(znaki[i] == 'x')
				steviloX++;
		}
		System.out.println("Tabela po polnejenju: " + Arrays.toString(znaki));
		
		while(poskusi!=0 && steviloX!=0)
		{
			System.out.print("Uganite kje je mina: ");
			indeksUgiba = in.nextInt();
			if(znaki[indeksUgiba] == 'x')
			{
				vprsaji[indeksUgiba] = 'x';
				System.out.println(Arrays.toString(vprsaji));
				steviloX--;
			}
			else 
			{
				System.out.println(1);
				poskusi--;
			}
		}
		if(steviloX==0)
			System.out.println("Čestitke uspelo ti je.");
		else
			System.out.println("Ni vam uspelo.");
		in.close();
		in.close();
	}
}
