package vaje0;
import java.util.*;
public class V2v1 
{
	public static void main(String[] args) 
	{
		int n=0,m=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Program za polnjenje  tabele s \"PELLOVEM ZAPOREDJEM\" v poljubnem območju.");
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
		int c1=0,c2=1,rez=0;
		int[] tabela={};
		for(;c1<=m;)
		{
			if(c1>=n) 
			{
				tabela = Arrays.copyOf(tabela, tabela.length+1);
				tabela[tabela.length-1] = c1;
			}
			rez = c1+2*c2;
			c1 = c2;
			c2 = rez;
		}
		return tabela;
	}
}