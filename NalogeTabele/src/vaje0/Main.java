package vaje0;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) 	
	{
		Scanner bralnik = new Scanner(System.in);
		int dolzina=0, mesto=0;
		char[] beseda, neznano;
		char znak;
		
		System.out.println("5. Naloga");
		
		System.out.print("Vnesite dolzino besedo: ");
		dolzina = bralnik.nextInt();
		beseda = new char[dolzina];
		neznano = new char[dolzina];
		System.out.println("Vnesite besedo znak po znak: ");
		for(int stevec=0;stevec<dolzina;stevec++) {
			beseda[stevec] = bralnik.next().charAt(0);
			neznano[stevec] = 'x';
		}
		do {
			System.out.print("Vnesite mesto znaka: ");
			mesto = bralnik.nextInt()-1;
			System.out.print("Vnesite znak: ");
			znak = bralnik.next().charAt(0);
			if(beseda[mesto] == znak ){
				System.out.printf("Znak %c se nahaja na tem mestu. :)%n", znak);
				neznano[mesto] = znak;
				System.out.println(Arrays.toString(neznano));
				dolzina--;
			}
		}while (dolzina!=0);
		if(dolzina==0)
			System.out.println("Čestitke, uganili ste besedo! Game Over!");
		else
			System.out.println("Skoraj vam je useplo! Better luck next time.");
		bralnik.close();
	}
}