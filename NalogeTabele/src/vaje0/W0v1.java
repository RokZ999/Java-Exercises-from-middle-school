package vaje0;
import java.util.Arrays;
public class W0v1 
{
	public static void main(String[] args) {
		System.out.println("12. Zasledovanje vrednosti");
		int[] tabela = {1,2,2,2,3,3,1,2,1,3,3,2,1};
		stetjeZaporednih(tabela, tabela.length);
	}
	static void stetjeZaporednih(int[] tabela, int velikost)
	{
		int[] kopija = {};
		int i=0;
		for(;i<velikost;i++)
		{
			if(!aliIma3(kopija, tabela[i]))
			{
				kopija = Arrays.copyOf(kopija, kopija.length+3);
				kopija[kopija.length-3] = tabela[i]; // Številka
				kopija[kopija.length-2] = pristej(tabela, tabela[i]); // Kok jih je
				kopija[kopija.length-1] = pristejPare(tabela, tabela[i]); // Pari
			}
		}
		for(i=0;i<kopija.length;i+=3)
			System.out.printf("%d %d %d%n", kopija[i],kopija[i+1],kopija[i+2]);
	}
	static boolean aliIma3(int[] arr,int iskanje)
	{
		for(int i=0;i<arr.length;i+=3)
			if(arr[i] == iskanje) return true;
		return false;
	}
	static int pristej(int[] arr,int iskanje)
	{
		int stevec=0;
		for(int i:arr)
			if(i==iskanje) stevec++;
		return stevec;
	}
	static int pristejPare(int[] arr,int iskanje)
    {
        int stevec=0,temp=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(temp<stevec) temp=stevec;
            if(arr[i]== iskanje && arr[i+1] ==arr[i])
                {
            		stevec++;
            		if(stevec==1) stevec++;
                }
            else
                stevec=0;
        }
        return temp;
    }
}