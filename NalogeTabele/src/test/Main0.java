package test;
import java.util.*;
public class Main0 
{
	public static void main(String[] args) 
	{
		int vnos;
		Scanner in = new Scanner(System.in);
		System.out.println("Program za polnjenje  tabele s \"Pellovem\" v poljubnem območju.");
		System.out.print("Vnesite do katerega člena želite izpisat zaporedje: ");
		vnos=in.nextInt();
		in.close();
		System.out.printf("V območju 0 do %d so bila generirana naslednja številia %s.%n", vnos,Arrays.toString(generator(vnos)));
	}
	static int[] generator(int vnos)
	{
		int c1=0,c2=1,rez=0;
		int[] tabela={};
		for(int stevec=0;stevec<vnos;)
		{
			tabela = Arrays.copyOf(tabela, tabela.length+1);
			tabela[tabela.length-1] = c1;
			rez = c1+2*c2;
			c1 = c2;
			c2 = rez;
			stevec++;
		}
		return tabela;
	}
}