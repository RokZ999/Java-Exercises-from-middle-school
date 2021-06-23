package recursion;
import java.util.Scanner;
public class V8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Najvejca stevka.");
		System.out.print("Vnos: ");
		int vnos = in.nextInt();
		in.close();
		System.out.printf("Najvecja stevka v stevilu: %d je %d.", vnos,NajvecjaStevka(vnos));
		
	}
	static int NajvecjaStevka(int vnos)
	{
		int a = 0;
		if(vnos!=0) a=NajvecjaStevka(vnos/10);
		return a>vnos%10 ? a : vnos%10;
	}
}
