package vaje0;

import java.util.Arrays;
import java.util.Scanner;

public class V6v0
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Program za enačbo premice.");
		int[] tabelaY = new int[1];
		System.out.print("Vnesite začetek in konec intervala npr. 1 100: ");
		tabelaXY(tabelaY, in.nextInt(), in.nextInt());
		in.close();
	}
	static void tabelaXY(int tabela[],int zacetek,int konec)
	{
		tabela = Arrays.copyOf(tabela,konec-zacetek+1);
		System.out.println("Točke: X | Y");
		for(int i=0;i<tabela.length;i++,zacetek++)
		{
			tabela[i] = (zacetek*zacetek*zacetek)-9*(zacetek*zacetek)+24*zacetek-17;
			System.out.printf("%8d | %d%n", zacetek,tabela[i]);
		}
	}
}