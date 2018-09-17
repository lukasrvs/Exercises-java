package Example;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String sentence = scan.nextLine();
		String x, y, z;
		x = scan.nextLine();
		y = scan.nextLine();
		z = scan.nextLine();

		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		x = scan.nextLine();
		y = scan.nextLine();
		z = scan.nextLine();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		scan.close();
	}

}
