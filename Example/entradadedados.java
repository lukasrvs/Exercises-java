package Example;

import java.util.Scanner;

public class entradadedados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			
			int n1 = Integer.parseInt(scan.nextLine());
			scan.nextLine();
			String name = scan.nextLine();
			char gender =  scan.next().charAt(0);
			
			/*String s = scan.next();
			char letter - scan.charAt(0);
			int digit = Integer.parseInt(scan.substring(1));*/
			
			System.out.println(n1);
			System.out.println(name);
			System.out.println(gender);
			
			scan.close();
	}

}
