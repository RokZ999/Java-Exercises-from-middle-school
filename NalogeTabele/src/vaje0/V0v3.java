package vaje0;
import java.util.*;
public class V0v3 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Program za določanje sodih in lihih števil v tabeli.");
		System.out.print("Vnesite velikost tabela: ");
		int[] tabela = new  int[in.nextInt()];
		for(int i=0;i<tabela.length;i++)
		{
			System.out.printf("Vnesite vrednost za tabelo[%d]: ", i); 
			tabela[i] = in.nextInt();
		}
		in.close();
		System.out.printf(Arrays.toString(sodaTabela(tabela)));
	}
	static int[] sodaTabela(int[] tabela)
	{
		int[] sodaTabela = new int[tabela.length];
		int stevec=0;
		for(int i:tabela)
			if(i%2==0)
				sodaTabela[stevec++]=i;
		return Arrays.copyOf(sodaTabela,stevec);
	}
}