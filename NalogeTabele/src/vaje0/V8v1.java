package vaje0;

import java.util.Arrays;

public class V8v1 {
	public static void main(String[] args) 
	{
		int[] arr1 = {1, 2, 2, 3, 4, 5, 1, 6, 3, 4}, arr2 = {1,6,2,3,4,5};
		System.out.println("9. Izpis poljubnih dvojnikov/duplikatov");
		brezD(arr1);
		brezD(arr2);
	}
	static void brezD(int[] arr)
	{
		int[] kopija ={};
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
				if(arr[i] == arr[j])  
				{
					kopija = Arrays.copyOf(kopija, kopija.length+1);
					kopija[kopija.length-1]  = arr[i];
				}
		if(kopija.length == 0)
			System.out.println("Tabela nima duplikatov.");
		else
			System.out.println(Arrays.toString(kopija));
		
	}
	static boolean aliIma(int[] arr,int iskanje)
	{
		for(int i:arr)
			if(i==iskanje) return true;
		return false;
	}
}
