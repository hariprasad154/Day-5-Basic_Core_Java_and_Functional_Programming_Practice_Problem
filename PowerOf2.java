package Day5Practice;

public class PowerOf2 {

	public static void main(String[] args) {
		int n = 30;

		int i = 0; 

		int powerOfTwo = 1; 

		
		if (n>0&&n<31) {
			while (i <= n) {

				System.out.println(i + " " + powerOfTwo); 

				powerOfTwo = 2 * powerOfTwo; 

				i = i + 1;

			}
			
		}else {
			System.out.println("enter correct number");
		}

	}

}
