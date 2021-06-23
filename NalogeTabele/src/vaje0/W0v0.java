package vaje0;
public class W0v0 {
	public static void main(String[] args) {
		System.out.println("12. Zasledovanje vrednosti");
		int[] tabela = {1, 2, 2, 3, 3, 3, 4, 4, 2, 2};
		stetjeZaporednih(tabela, tabela.length);
	}
	static void stetjeZaporednih(int[] tabela, int velikost)
	{
		int i=0,stetje=0;
		for(;i<velikost-1;i++)
		{
			if(tabela[i]==tabela[i+1]) 
				stetje++;
		}
		System.out.printf("%d%n",stetje);
	}
}
