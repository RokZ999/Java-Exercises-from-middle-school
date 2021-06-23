package recursion;

import java.util.Scanner;

public class V2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Izračun vsote od 1 do N.");
		System.out.print("Vnos: ");
		int vnos = in.nextInt();
		System.out.print("Vsota števil od 1 do 5 znaša: ");
		System.out.print(rekurzija(vnos));
		in.close();
	}
	static int rekurzija(int vnos)
	{
		if(vnos<1) return 0;
		System.out.printf("%d%s", vnos, vnos!=1 ? "+" : "=");
		 return vnos + rekurzija(vnos-1);
	}
}
