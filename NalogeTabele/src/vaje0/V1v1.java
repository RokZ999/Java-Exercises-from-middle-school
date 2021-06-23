package vaje0;
import java.util.*;
public class V1v1 
{
	public static void main(String[] args) 
	{
		
		int[] tabela,kopija;
		Scanner in = new Scanner(System.in);
		System.out.println("Program za določitev min/max.");
		System.out.print("Vnesite velikost tabele: ");
		kopija = tabela = new  int[in.nextInt()];
		for(int i=0;i<tabela.length;i++)
		{
			System.out.printf("Vnesite vrednost za tabelo[%d]: ", i); 
			tabela[i] = in.nextInt();
		}
		in.close();
		System.out.printf("Najmanjša vrednost v tabeli je: %d%n", min(kopija));
		System.out.printf("Največja Vrednost v tabeli je: %d%n", max(tabela));
	}
	static int min(int[] tabela) 
	{
		for(int i:tabela)
			tabela[0] = tabela[0]>i ? i : tabela[0];
		return tabela[0];
	}
	static int max(int[] tabela) 
	{
		for(int i:tabela)
			tabela[0] = tabela[0]<i ? i : tabela[0];
		return tabela[0];
	}
}