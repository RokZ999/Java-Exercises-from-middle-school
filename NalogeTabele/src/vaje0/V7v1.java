package vaje0;
import java.util.Arrays;
public class V7v1 
{
	public static void main(String[] args) 
	{
		System.out.println("Program za izpis zaporednih duplikatov.");
		int[] vrednosti = {1, 2, 2, 3, 3, 3, 4, 4, 2, 2};
		System.out.printf(Arrays.toString(isti(vrednosti)));
	}
	static int[] isti(int arr[])
	  { 
		 int[] copy = {};
		 for(int i=0;i<arr.length-1;i++)
		 {
			 if(arr[i] == arr[i+1] && !aliIma(copy, arr[i]))
			 {
				 copy = Arrays.copyOf(copy, copy.length+1);
				 copy[copy.length-1] = arr[i];
			 }
		 }
		 return copy;
	  } 
	static boolean aliIma(int[] arr,int iskanje)
	{
		for(int i:arr)
			if(i==iskanje) return true;
		return false;
	}
}
