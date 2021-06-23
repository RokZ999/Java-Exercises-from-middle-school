package recursion;

public class Main0 {
	  public static void main(String[] args) {
	    metoda(4);
	  }
	    public static void metoda(int n) {
	      if(n>0)
	      {
	    	  metoda(n-1);
	    	  System.out.printf("%d ", n);
	    	  metoda(n-1);
	      }
	    }

	 }
