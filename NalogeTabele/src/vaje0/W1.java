package vaje0;
import java.util.Scanner;
public class W1 
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("13. Hide and seek");
		
		int[] arr = new int[15];
		for(int i=0;i<15;i++)
		{
			System.out.printf("Vnesite vrednost za tabelo[%d]: ", i);
			arr[i] = in.nextInt();
		}
		HandS(arr);
		in.close();
	}
	static void HandS(int[] arr)
	{
		int vrednost=0;
		System.out.print("Uganite vrednost v tabeli: ");
		vrednost = in.nextInt();
			for(int i=0;i<15;i++)
				if(vrednost==arr[i])
					System.out.printf("Število %d se nahaja na %d mestu v tabeli. %n", arr[i], i);
		return;	
	}
}