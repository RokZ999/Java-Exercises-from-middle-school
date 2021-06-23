package recursion;

import java.util.Scanner;

public class V1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Izpis sode od 0 do N.");
		System.out.print("Vnos: ");
		rekurzija( new Scanner(System.in).nextInt());

	}
	static void rekurzija(int vnos)
	{
		System.out.print(vnos%2==0 ? vnos+" " : "");
		if (vnos>0) rekurzija(vnos-1);
	}
}
