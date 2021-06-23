package vaje0;
import java.util.Scanner;
public class V4v2 
{
	public static void main(String[] args) 
	{
		System.out.println("Program za enačbo premice.");
		int[] tabelaY = new int[100];
		System.out.print("Vnesite vhodno spremenljivko: ");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Vnesite začetek, konec in vhodno spremelnjivko intervala npr. 1 100 10: ");
		tabelaXY(tabelaY, scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		scanner.close();
	}
	static void tabelaXY(int tabela[],int zacetek,int konec, int vnos)
	{
		System.out.println("Točke: X | Y");
		for(int i=zacetek;i<=konec;i++)
		{
			tabela[i-1]=2*(i*i)-4*i+2;
			System.out.printf("%s", (tabela[i-1]<vnos) ? String.format("%8d | %d%n", i,tabela[i-1]) : "");
		}
	}
}