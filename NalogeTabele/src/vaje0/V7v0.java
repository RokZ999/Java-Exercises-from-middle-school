package vaje0;
import java.util.Arrays;
public class V7v0 
{
	public static void main(String[] args) 
	{
		System.out.println("Program za štetje ddvojnikov v dani tabeli.");
		int[] vrednosti = {1, 2, 2, 3, 3,5, 3, 4, 4, 2, 2,7};
		System.out.printf(Arrays.toString(brez2(vrednosti)));
	}
	static int[] brez2(int[] vrednosti) 
	{
		int[] brez2 = {};
		int i=0;
		for(;i<vrednosti.length;i++)
		{
			if(jeEdin(vrednosti, i))
			{
				brez2 = Arrays.copyOf(brez2, brez2.length+1);
				brez2[brez2.length-1] = vrednosti[i];
			}
			else if(i<vrednosti.length-1  &&vrednosti[i] == vrednosti[i+1]) 
				continue;
			else
			{
				brez2 = Arrays.copyOf(brez2, brez2.length+1);
				brez2[brez2.length-1] = vrednosti[i];
			}
		}
		return brez2;
	}
	static boolean jeEdin(int[] vrednosti,int index)
	{
		for(int i=0;i<vrednosti.length;i++)
		{
			if(index==i) continue;
			if(vrednosti[index] == vrednosti[i]) return false;
		}
		return true;
	}
}
