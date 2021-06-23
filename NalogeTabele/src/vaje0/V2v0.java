package vaje0;
import java.util.*;
public class V2v0 
{
	public static void main(String[] args) 
	{
		int n=0,m=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Program za polnjenje  tabele s \"PRAŠTEVIL\" v poljubnem območju.");
		do {
			System.out.print("Vnesite začetek območja: ");
			n = in.nextInt();
			System.out.print("Vnesite konec območja: ");
			m = in.nextInt();
		}while (n>m && n<0);
		in.close();
		System.out.printf("V območju %d do %d so bila generirana naslednja številia %s.%n", n,m,Arrays.toString(generator(n,m)));
	}
	static int[] generator(int n, int m)
	{
		int stevec=0;
		int[] tabela={};
		for(;n<=m;n++)
		{
			for(stevec=2;stevec<n;stevec++)
				if(n%stevec==0) break;
			if(n==stevec)
			{
				tabela = Arrays.copyOf(tabela, tabela.length+1);
				tabela[tabela.length-1]=n;		
			}
		}
		return tabela;
	}
}