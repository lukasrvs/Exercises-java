package Lista3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cont=0;
		int age=0;
		int soma=0;
		
		for(;;) {
			System.out.println("Digite uma idade: (0 para Finalizar)");
			age = scan.nextInt();
			
			cont++;
			
			soma+=age;
			
			if(age == 0) {
				cont--;
				break;
			}
		}
		
		System.out.println("Foram digitadas "+cont+"idades, e a média é igual a "+(soma/cont));
		scan.close();
	}
}
