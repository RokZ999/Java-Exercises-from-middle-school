package recursion;
import java.util.Scanner;
public class V6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Stevilo stevk");
		System.out.print("Vnos: ");
		int vnos = in.nextInt();
		in.close();
		System.out.printf("V stevilu %d imamo %d stevko/stevki/stevke.", vnos,rekurzija(vnos));
	}
	static int rekurzija(int vnos)
	{
		return vnos==0 ? 0 : 1+rekurzija(vnos/10);
	}
}
