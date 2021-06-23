package vaje0;
import java.util.*;
public class V1v0 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Program za določitev min/max.");
		System.out.print("Vnesite velikost tabele: ");
		int[] tabela = new  int[in.nextInt()];
		for(int i=0;i<tabela.length;i++)
		{
			System.out.printf("Vnesite vrednost za tabelo[%d]: ", i); 
			tabela[i] = in.nextInt();
		}
		in.close();
		System.out.printf("Najmanjša vrednost v tabeli je: %d%n", min(tabela));
		System.out.printf("Največja Vrednost v tabeli je: %d%n", max(tabela));
	}
	static int min(int[] tabela) {
		int min=tabela[0];
		for(int i:tabela)
			min = min>i ? i : min;
		return min;
	}
	static int max(int[] tabela) {
		int max=tabela[0];
		for(int i:tabela)
			max = max<i ? i : max;
		return max;
	}
}