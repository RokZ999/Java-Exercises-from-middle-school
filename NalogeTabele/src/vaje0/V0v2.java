package vaje0;
import java.util.*;
public class V0v2 
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
		System.out.printf("V tabeli je na lihih indeksih %d sodih elemntov.%n",stetjeLihi(tabela));
		System.out.printf("V tabeli je na sodih indeksih %d lihih elemntov.%n",stetjeSodih(tabela));
	}
	static int stetjeSodih(int[] tabela)
	{
		int stevec=0;
		for(int i=1;i<tabela.length;i+=2)
			stevec = (tabela[i]%2==0) ? stevec+1 : stevec;
		return stevec;
	}
	static int stetjeLihi(int[] tabela)
	{
		int stevec=0;
		for(int i=0;i<tabela.length;i+=2)
			stevec = (tabela[i]%2==1) ? stevec+1 : stevec;
		return stevec;
	}
}