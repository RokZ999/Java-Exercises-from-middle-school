package vaje0;
import java.util.Arrays;
public class V4v0 
{
	public static void main(String[] args) 
	{
		System.out.println("Program za enačbo krivulje1-");
		int[] tabelaY = new int[100];
		for(int i=0;i<50;i++)
			tabelaY[i] = 2*((i+1)*(i+1))-4*(i+1)+2;
		System.out.print(Arrays.toString(tabelaY));
	}
}
