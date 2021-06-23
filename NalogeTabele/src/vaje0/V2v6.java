package vaje0;
import java.util.*;
public class V2v6
{
	public static void main(String[] args) 
	{
		int n=0,m=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Program za polnjenje  tabele s \"Pikolovskimi števili\" v poljubnem območju.");
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
		int vnos=0,zmnozekStevk=1,vsotaStevk=0,dolzina=0;
		int[] tabela={};
		for(;n<=m;n++,vsotaStevk=0)
		{
			dolzina=String.valueOf(n).length();
			for(vnos=n;vnos!=0;vnos/=10,dolzina--)
			{
				for(int stevec=1;stevec<=dolzina;stevec++)
				{
					zmnozekStevk*=vnos%10;
				}
				vsotaStevk= vnos<10 ? vsotaStevk+zmnozekStevk : vsotaStevk-zmnozekStevk;
				zmnozekStevk=1; // Reset
			}
				if(n/2>Math.abs(vsotaStevk)) 
				{
					tabela = Arrays.copyOf(tabela,tabela.length+1);
					tabela[tabela.length-1] = n;
				}
				
		}
		return tabela;
	}
}
