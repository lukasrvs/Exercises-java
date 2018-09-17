package Example;

import java.util.Locale;
import java.util.Scanner;

public class exerciciofx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String name=null;
		int num=0;
		double price=0;
		String lastN=null;
		int age=0;
		double height=0;
		
		System.out.println("Enter your full name:");
		name = String.valueOf(scan.nextLine());
		System.out.println("How many bedrooms are there in your house?");
		num = Integer.parseInt(scan.nextLine());
		System.out.println("Enter product price: ");
		price = Double.parseDouble(scan.nextLine());
		System.out.println("Enter your last name, age and height (same line): ");
		lastN = scan.next(); 
		age = scan.nextInt();
		height = scan.nextDouble();
		
		System.out.println("-------------------------");
		System.out.println(name);
		System.out.println(num);
		System.out.println(price);
		System.out.println(lastN);
		System.out.println(age);
		System.out.println(height);
		
		scan.close();
		
	}

}
