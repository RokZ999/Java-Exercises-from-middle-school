package vaje0;
import java.util.Arrays;
public class W0 {
	public static void main(String[] args) {
		System.out.println("10. Štetje vsake vrednosti");
		System.out.println("Štetje istih vrednost v tabeli");
		int[] tabela = {1, 2, 2, 3, 3, 3, 4, 4, 2, 2}, arr2 = {};
		int i=0,i2=0;
		for(;i<tabela.length;i++)
			if(!aliIma2(arr2, tabela[i]))
			{
				arr2 = Arrays.copyOf(arr2, arr2.length+2);
				arr2[arr2.length-2] = tabela[i];
				arr2[arr2.length-1]++;
				for(i2=0;i2<tabela.length;i2++)
				{
					if(i2==i) continue;
					if(arr2[arr2.length-2]==tabela[i2])
						arr2[arr2.length-1]++;
				}
			}
		for(i=1;i<arr2.length;i+=2)
			if(arr2[1]<arr2[i])
			{
				arr2[1] =arr2[i];
				i2=i;
			}
		System.out.printf("V dani tabeli se največkrat ponovi %d in ponovi se %dx.%n",arr2[i2-1],arr2[i2]);
	}
	static boolean aliIma2(int[] arr,int iskanje)
	{
		for(int i=0;i<arr.length;i+=2)
			if(arr[i] == iskanje) return true;
		return false;
	}
}
