package recursion;

public class V9 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		izpis(arr,arr.length);
		
	}
	static void izpis(int[] arr, int n)
	{
		if(n==0) return;
		System.out.printf("%d ", arr[n-1]);
		izpis(arr, n-1);
	}
}
