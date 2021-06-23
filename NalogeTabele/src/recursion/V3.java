package recursion;
import java.util.Scanner;
public class V3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Izračun sodih od 2 do N.");
		System.out.print("Vnos: ");
		int vnos = in.nextInt();
		System.out.printf("Vsota števil od 2 do %d znaša: %d",vnos,rekurzija(vnos));
		in.close();
	}
	static int rekurzija(int vnos)
	{
		if(vnos%2 == 1) vnos--;
		return vnos<2 ?  vnos : vnos+rekurzija(vnos-2);
	}
}
