package vaje0;
import java.util.*;
public class V2v2 
{
	public static void main(String[] args) 
	{
		int n=0,m=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Program za polnjenje  tabele s \"Polpalindromi\" v poljubnem območju.");
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
		int zacasna=0, zacasna2=0, obrnjena=0;
		int[] tabela={};
		for(;n<=m;n++)
		{
			zacasna2 = zacasna = n-n%10+n/10%10-n/10%10*10+n%10*10;
			for(obrnjena=0;zacasna!=0;obrnjena=zacasna%10+obrnjena*10,zacasna/=10);
			if(zacasna2==obrnjena)
			{
				tabela = Arrays.copyOf(tabela,tabela.length+1);
				tabela[tabela.length-1] = zacasna2;
			}
		}
		return tabela;
	}
}