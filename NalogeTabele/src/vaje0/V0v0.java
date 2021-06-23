package vaje0;
import java.util.*;
public class V0v0 {
	public static void main(String[] args) 
	{
		System.out.println("Program za polnjenje tabele s prvimi 10. praštevili.");
		int[] tabela = new int[5];
		int praStevec=0,stevec2=0,stevec=0;
		for(stevec=2;tabela[4] == 0;stevec++)
		{
			for(stevec2=2;stevec2<stevec;stevec2++)
				if(stevec%stevec2==0) 
					break;
			if(stevec==stevec2) 
				tabela[praStevec++] = stevec;
		}
		tabela = Arrays.copyOf(tabela, 10);
		for(;tabela[9] == 0;stevec++)
		{
			for(stevec2=2;stevec2<stevec;stevec2++)
				if(stevec%stevec2==0) 
					break;
			if(stevec==stevec2) 
				tabela[praStevec++] = stevec;
		}
		System.out.println(Arrays.toString(tabela));
	}
}