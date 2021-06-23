package test;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int[] tabela = new Random().ints(100,11,100000).toArray();
		System.out.println("Iskanje od A do Ž ");
		System.out.println("Generirana tabela" + Arrays.toString(tabela));
		System.out.println("Nasa tabela" + Arrays.toString(main(tabela)));
	}

	public static int[] main(int[] tabela) {
	  int[] tabela2 = {};
	  int i = 0, zacasna = 0, vsota = 0, potenca = 0;
	  boolean zastavica=true;
	  for (; i < tabela.length; i++, vsota = 0, potenca = 0,zastavica=true) 
	  {
		  for(zacasna=tabela[i]; zacasna!=0; zacasna/=10,potenca++);
		  for(zacasna=tabela[i]; zacasna!=0;zacasna/=10)
		  {
			  vsota+=(int)Math.pow(zacasna%10, potenca);
	
		  }
		  for(zacasna=tabela[i]; zacasna!=0; zacasna/=10)
			  if(zacasna%10==3) 
				  zastavica = false;
		  
		  if(vsota==tabela[i] && zastavica)
		  {
			  tabela2 = Arrays.copyOf(tabela2, tabela2.length+1);
			  tabela2[tabela2.length-1] = tabela[i];
		  }
	  }
	  return tabela2;
	 }
}