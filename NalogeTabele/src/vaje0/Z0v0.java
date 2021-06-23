package vaje0;
import java.util.Arrays;
public class Z0v0 {
	public static void main(String[] args) 
	{
		System.out.println("31. Nogavice brez para");
		int[] arr = {1, 1, 4, 1, 3, 1};
		System.out.println(Arrays.toString(brezParaTabela(arr)));
	}
	static int[] brezParaTabela(int[] arr)
	{
		int[] pari = {};
		for(int i=0;i<arr.length;i++)
			if(!aliIma2(pari,arr[i]))
			{
				pari = Arrays.copyOf(pari, pari.length+2);
				pari[pari.length-2] = arr[i];
				pari[pari.length-1] = pristejPare(arr,arr[i]);
			}
		arr = new int[0];
		System.out.println("Stanje po stetju: "+Arrays.toString(pari));
		
		for(int i=1;i<pari.length;i+=2)
			if(pari[i]%2==1)
			{
				arr = Arrays.copyOf(arr, arr.length+1);
				arr[arr.length-1] = pari[i-1];
			}
		return arr;
	}
	static boolean aliIma2(int[] arr,int iskana)
	{
		for(int i=0;i<arr.length;i+=2)
			if(arr[i]==iskana) return true;
		return false;
	}
	static int pristejPare(int[] arr,int iskana)
	{
		int stevec=0;
		for(int i:arr)
			if(i==iskana) stevec++;
		return stevec;
	}
}
