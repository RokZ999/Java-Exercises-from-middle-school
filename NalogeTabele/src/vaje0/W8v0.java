package vaje0;
import java.util.Arrays;
import java.util.Scanner;
public class W8v0
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[] tabela= {1,3,2,4,6,10,7,5,9,8};
        System.out.println("Preverjanje nazadovanja ali napredovanja drzav po medaljah.");
        System.out.println(Arrays.toString(tabela));
        System.out.println("Napredovalo je " + napred(tabela) + " drzav.");
	}
	static int napred(int[] tabela)
	{
	  int i=0,napredovanje=0;
		for(;i<tabela.length;i++) 
		{
            if(i+1>tabela[i])
                napredovanje++;
		}
		return napredovanje;
	}
}