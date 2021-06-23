package recursion;
import java.util.Scanner;
public class V7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Vsota stevk");
		System.out.print("Vnos: ");
		int vnos = in.nextInt();
		in.close();
		System.out.printf("Vsota stevk stevila %d znasa %d.", vnos,rekurzija(vnos));
	}
	static int rekurzija(int vnos)
	{
		return vnos==0 ? 0 : (vnos%10%2==0 ? vnos%10 : 0) + rekurzija(vnos/10);
	}
}
