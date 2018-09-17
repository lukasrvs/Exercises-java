package Lista3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float fat1=0;
		float fat=0;
		int i=0;
		
		System.out.println("Digite o número da fatorial (Ex:5!= 5 * 4 * 3 * 2 * 1 = 120))");
		fat = scan.nextFloat();
		
		fat1=fat;
		
		for(i=1;i<fat;i++) {
			fat1 = fat1 * i;
		}
		
		System.out.println("A valor da fatorial de "+fat+"! é igual a: "+fat1);
		scan.close();
	}
}
