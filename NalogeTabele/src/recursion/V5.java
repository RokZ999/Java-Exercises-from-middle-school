package recursion;
import java.util.Scanner;
public class V5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Izpis brez zadnje stevke vse do enice.");
		System.out.print("Vnos: ");
		int vnos = in.nextInt();
		rekurzija(vnos);
		in.close();
	}
	static void rekurzija(int vnos)
	{
		System.out.println(vnos%10);
		if(vnos>9) rekurzija(vnos/10);
	}
}
