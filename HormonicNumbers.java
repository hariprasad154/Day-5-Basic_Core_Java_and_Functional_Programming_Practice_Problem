package Day5Practice;

public class HormonicNumbers {

	public static void main(String[] args) {
		int n=8;
		float harmonic = 1;
		 
	    
	    for (int i = 2; i <= n; i++) {
	        harmonic += (float)1 / i;
	    }
	    
	    System.out.print(harmonic);
	    
	}

}
