package recursion;

import java.util.*;

class Y11 {
	public static void main(String[] args) {
		int igra[][] = new int[9][9];
		int stevecPotez = 0;
		PolnjenjeTabele(igra, 3);
		Scanner bralnik = new Scanner(System.in);
		while (AliSoVsaPoljaEnaka(igra) == false) {
			Izpisi(igra);
			System.out.print("Vnesite vrednost s katero želite barvati:");
			int barva = bralnik.nextInt();
			stevecPotez++;
			barvaj(igra, igra[0][0], barva, 0, 0);
		}
		Izpisi(igra);
		System.out.printf("ČESTITKE! Zmagali ste v %d potezah.", stevecPotez);
		bralnik.close();
	}

	public static void PolnjenjeTabele(int[][] tabela, int max) {
		Random rnd = new Random();
		for (int i = 0; i < tabela.length; i++) {
			for (int j = 0; j < tabela[i].length; j++) {
				tabela[i][j] = rnd.nextInt(max) + 1;
			}
		}
	}

	public static void Izpisi(int tabela[][]) {
		for (int i = 0; i < tabela.length; i++) {
			for (int j = 0; j < tabela[i].length; j++) {
				System.out.print(tabela[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static boolean AliSoVsaPoljaEnaka(int[][] tabela) {
		int prvaVrednost = tabela[0][0];
		for (int i = 0; i < tabela.length; i++) {
			for (int j = 0; j < tabela[i].length; j++) {
				if (tabela[i][j] != prvaVrednost) {
					return false;
				}
			}
		}
		return true;
	}

	public static void barvaj(int[][] tabela, int zacetnaBarvaPrvegaElementa, int barva, int i, int j) {
		tabela[i][j] = barva;
		if (i + 1 < tabela[0].length && tabela[i + 1][j] == zacetnaBarvaPrvegaElementa) {
			barvaj(tabela, zacetnaBarvaPrvegaElementa, barva, i + 1, j);
		}
		if (j + 1 < tabela.length && tabela[i][j + 1] == zacetnaBarvaPrvegaElementa) {
			barvaj(tabela, zacetnaBarvaPrvegaElementa, barva, i, j + 1);
		}
	}
}