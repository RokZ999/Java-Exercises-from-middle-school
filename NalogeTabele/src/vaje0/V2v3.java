package vaje0;
import java.util.*;
public class V2v3 
{
	public static void main(String[] args) 
	{
		int n=0,m=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Program za polnjenje  tabele s \"Popolnih števil\" v poljubnem območju.");
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
		int vsota=0;
		int[] tabela={};
		for(;n<=m;n++)
		{
			vsota=0;
			for(int stevec=1;stevec<n;stevec++)
				if(n%stevec==0)
					vsota+=stevec;
				if(n==vsota) 
				{
					tabela = Arrays.copyOf(tabela,tabela.length+1);
					tabela[tabela.length-1] = n;
				}
		}
		return tabela;
	}
}