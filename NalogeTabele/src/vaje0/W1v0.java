package vaje0;
import java.util.Scanner;
public class W1v0
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
		System.out.println(HandS(arr,arr.length));
		in.close();
	}
	static char HandS(int[] arr, int velikost)
	{
		int vrednost=0,stevec=0;
		System.out.print("Uganite vrednost v tabeli: ");
		vrednost = in.nextInt();
			for(int i=0;i<velikost;i++)
				if(vrednost==arr[i])
				{
					System.out.printf("Število %d se nahaja na %d mestu v tabeli. %n", arr[i], i);
					stevec++;
				}
			if(stevec==0) return 'a';
			else if(stevec>0 && stevec<4) return 'b';
			else if(stevec>3 && stevec<7) return 'b';
			else if(stevec>6 && stevec<10) return 'b';
			else  return 'b';
	}
}
