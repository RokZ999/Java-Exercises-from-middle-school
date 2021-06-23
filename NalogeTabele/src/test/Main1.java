package test;
import java.util.Arrays;
import java.util.Scanner;
public class Main1 {
	public static void main(String[] args) {
		int velikost = 0;
		Scanner bralnik = new Scanner(System.in);
		System.out.println("Vsote elementov.");
		System.out.print("Vnesite velikost tabele: ");
		velikost = bralnik.nextInt();
		int[] tabela = new int[velikost];
		for(int i=0;i<tabela.length;i++)
		{
			System.out.printf("Vnesite vrednost za tabelo[%d]: ", i);
			tabela[i] = bralnik.nextInt();
		}
		bralnik.close();
		System.out.printf(Arrays.toString(vsota(tabela)));
	}
	static int[] vsota(int[] tabela)
	{
		int[] tabela2= {tabela[0]+tabela[1]};
		for(int i=1;i<tabela.length-1;i++)
		{
			tabela2 = Arrays.copyOf(tabela2, tabela2.length+1);
			tabela2[tabela2.length-1] = tabela2[i-1]+tabela[i+1];						
		}
		return tabela2;
	}
}
