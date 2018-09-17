package Lista3;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num=0,i=0;
		
		System.out.println("Digite um número inteiro: ");
		num = scan.nextInt();
		
		for(;;) {
			i++;
			if(num % i == 0) {
				System.out.println(""+i);
			}
			scan.close();
		}
	}
}
