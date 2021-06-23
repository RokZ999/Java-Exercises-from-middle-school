package vaje0;
public class X4 {
	public static void main(String[] args) 
	{
		System.out.println("25.	Sodi, lihi");
		int[] arr = {5, 8, 4, 17, 13, 10, 9};
		sodaLihi(arr);
	}
	static void sodaLihi(int[] arr)
	{
		for(int i:arr)
			if(i%2==1)
				System.out.printf("%d ", i);
		for(int i:arr)
			if(i%2==0)
				System.out.printf("%d ", i);
		
	}
	
}
