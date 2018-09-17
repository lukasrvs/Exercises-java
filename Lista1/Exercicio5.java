package Lista1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float c;
		float f;
		
		System.out.println("Digite a temperatura em Fahrenheit:");
		f = scan.nextInt();
		
		c = (f-32)/9 ;
		c = c/5;
		
		System.out.println("A temperatura em celsius é:" +c);
		
		scan.close(); 
	}
}
