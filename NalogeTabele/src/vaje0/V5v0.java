package vaje0;
import java.util.Arrays;
public class V5v0 
{
	public static void main(String[] args) 
	{
		System.out.println("Program za enačbo krivulje2.");
		int[] tabelaY = new int[5];
		for(int i=0;i<5;i++)
			tabelaY[i] = (int)Math.pow(i-3,2)+2*(i-3)-3;
		System.out.print(Arrays.toString(tabelaY));
	}
}
