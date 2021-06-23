package vaje0;

import java.util.Arrays;

public class W0v0UbijSeVerzija {
	static int[] kljuci;//kljuc,ponovitev,zaporedje, kljuc,...
    
    static int[] tabela1;
 
     public static void main(String[]args){
        int[] nums = {1,2,2,2,3,3,1,2,1,3,3,2,1};
        System.out.println(foo(nums));
     }
   
     static int foo(int[]tabela) {
         
         //ustvari tabelo
         tabela1 = tabela;
         kljuci= new int[0];
         //dobi ponovitve, zaporedja
            for(int i: tabela1)
            if(vsebujeVrednost(i,kljuci)) continue;
            else kljuci = dodajkljuc(i, kljuci);
         
            for(int i=0; i<kljuci.length;i+=3) {
            int stevec=0;
            int stevec2=0;
            for (int vrednost:tabela1) {
                if(vrednost==kljuci[i])
                {
                    stevec++;
                    stevec2++;
                }
                else if(stevec2 != 0 && kljuci[i+2]<stevec2) {
                    kljuci[i+2]=stevec2;
                    stevec2=0;
                }
            }
            kljuci[i+1]=stevec;
        }
   
     //vrni resitve
        int najpogostejsi=0;
        int najboljSePonavlja=0;
        for(int i=0; i<kljuci.length;i+=3) {
           if(kljuci[i+1]>kljuci[najpogostejsi+1]) najpogostejsi=i;
           if(kljuci[i+2]>kljuci[najboljSePonavlja+2]) najboljSePonavlja=i;
        }
            if (najpogostejsi>najboljSePonavlja) return najpogostejsi;
            else return najboljSePonavlja;
     }
     
     static int[] dodajkljuc(int kljuc, int[] tabela) {
         int dolzina = tabela.length;
         tabela = Arrays.copyOf(tabela, tabela.length+3);
         tabela[dolzina]=kljuc;
         tabela[dolzina+1]=0;
         tabela[dolzina+2]=0;
         return tabela;
     }
     
     static boolean vsebujeVrednost(int stevilo, int[] tabela)
     {
        for(int i=0; i<tabela.length;i+=3)
            if(tabela[i] == stevilo) return true;
        return false;
     }
     static int pridobiIndex(int stevilo, int[] tabela) {
         
         for(int i =0; i<tabela.length;i+=3)
            if(tabela[i]==stevilo) return i;
        return -1;
     }
}
