package recursion;

import java.util.Scanner;

public class V0 {
	public static void main(String[] args) {
		System.out.println("Izpis od 1 do N.");
		System.out.print("Vnos: ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		rekurzija( scanner.nextInt());
		izpis(-5);
	}
	static void rekurzija(int vnos)
	{
		if (vnos>1) rekurzija(vnos-1);
		System.out.print(vnos + " ");
	}
	public static void izpis(int n) {
	    if(n!=0) {
	        System.out.printf("%d ", n);
	        izpis(n-1);
	        System.out.printf("%d ", n);
	    }
	}

}
