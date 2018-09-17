package Example;

import java.util.Locale;
import java.util.Scanner;

public class whilef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: \n");
		double n = scan.nextDouble();
		
		while(n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3%n",sr);
			System.out.println("Enter another number");
			n = scan.nextDouble();
		}
		
		System.out.println("Negative number!!!");
		
		scan.close();
	
	}

}
