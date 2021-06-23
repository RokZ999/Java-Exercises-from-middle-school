package vaje0;

import java.util.Scanner;

public class V5v1 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Program za enačbo premice.");
		int[] tabelaY = new int[100];
		System.out.print("Vnesite začetek in konec intervala npr. 1 100: ");
		tabelaXY(tabelaY, in.nextInt(), in.nextInt());
		in.close();
	}
	static void tabelaXY(int tabela[],int zacetek,int konec)
	{
		System.out.println("Točke: X | Y");
		for(int i=zacetek;i<=konec;i++)
		{
			tabela[i-1] = (int)Math.pow(i-3,2)+2*(i-3)-3;
			System.out.printf("%8d | %d%n", i,tabela[i-1]);
		}
	}
}