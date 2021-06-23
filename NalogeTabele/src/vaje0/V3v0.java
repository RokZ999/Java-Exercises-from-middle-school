package vaje0;
import java.util.Arrays;
public class V3v0 
{
	public static void main(String[] args) 
	{
		System.out.println("Program za enačbo premice.");
		int[] tabelaY = new int[100];
		for(int i=0;i<100;i++)
			tabelaY[i] = 2*(i+1)-4;
		System.out.print(Arrays.toString(tabelaY));
	}
}
