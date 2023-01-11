package Day5Practice;

import java.util.Scanner;

public class Greatest_of_Tree {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		int num1=src.nextInt();
		int num2=src.nextInt();
		int num3=src.nextInt();
		
		if ((num1>num2) && (num1>num3)) {
			System.out.println(num1+" -is greater");
			
		}
		else if((num2 > num1)&&(num2>num3)){
			System.out.println(num2 + " is grater");
		}
		else
		 {
			System.out.println(num3 + " is grater" );
		}
		

	}

}
