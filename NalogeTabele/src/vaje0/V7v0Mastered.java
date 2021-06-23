package vaje0;
import java.util.Arrays;
public class V7v0Mastered
{
	public static void main(String[] args) 
	{
		System.out.println("Program za štetje ddvojnikov v dani tabeli.");
		int[] vrednosti = {1, 2, 2, 3, 3, 3, 4, 4, 2, 2};
		System.out.printf(Arrays.toString(brez2(vrednosti)));
	}
	static int[] brez2(int[] vrednosti) 
	{
		int[] brez2 = {};
		for (int i : vrednosti) {
			if(!contains(brez2,i))
			{
				brez2 = Arrays.copyOf(brez2, brez2.length+1);
				brez2[brez2.length-1] = vrednosti[i];
			}
		}
		return brez2;
	}
	public static boolean contains(final int[] array, final int v) {

        boolean result = false;

        for(int i : array){
            if(i == v){
                result = true;
                break;
            }
        }
        return result;
    }
}
