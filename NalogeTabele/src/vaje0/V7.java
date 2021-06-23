package vaje0;
public class V7
{
	public static void main(String[] args) 
	{
		System.out.println("Program za štetje ddvojnikov v dani tabeli.");
		int[] vrednosti = {1, 2, 2, 3, 3, 3, 4, 4, 2, 2};
		int stevec=0,i2=0,i=0;
		for(;i<vrednosti.length;i++)
		{
			for(i2=i+1;i2<vrednosti.length;i2++)
			{
				if(vrednosti[i]==vrednosti[i2])
				{
					stevec++;
					break;
				}
			}
		}	
		System.out.printf("V dani tabeli imamo %d duplikatov.",stevec);
	}
}
