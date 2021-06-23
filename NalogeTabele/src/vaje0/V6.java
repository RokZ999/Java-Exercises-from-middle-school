package vaje0;

import java.util.Arrays;

public class V6 {

	public static void main(String[] args) {
			System.out.println("Program za enačbo polinoma");
			int[] tabelaY = new int[6];
			for(int i=0;i<6;i++)
				tabelaY[i] = (i*i*i)-9*(i*i)+24*i-17;
			System.out.print(Arrays.toString(tabelaY));
	}
}
