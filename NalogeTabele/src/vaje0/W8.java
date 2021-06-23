package vaje0;
import java.util.Arrays;
import java.util.Scanner;
public class W8
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[] tabela= {1,3,2,4,6,10,7,5,9,8};
        System.out.println("Preverjanje nazadovanja ali napredovanja drzav po medaljah.");
        System.out.println(Arrays.toString(tabela));
        int i=0,napredovanje=0,nazadovanje=0;
        for(;i<tabela.length;i++) {
            if(i+1>tabela[i])
                napredovanje++;
            else if(i+1<tabela[i])
                nazadovanje++;
        }
        System.out.printf("Napredovalo je %d drzav, nazadovalo pa %d drzav.%n",napredovanje,nazadovanje);
	}
}