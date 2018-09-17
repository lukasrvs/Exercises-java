package Lista2;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double volume;
		double massa;
		double densidade;
		double valor;
		
		System.out.println("Digite o valor por massa do leite em (R$):");
		valor = scan.nextDouble();
		System.out.println("Digite o valor da massa em (kg/l) :");
		massa = scan.nextDouble();
		System.out.println("Digite o valor da densidade (kg/l):");
		densidade = scan.nextDouble();
		
		volume = massa/densidade;
		
		valor*=massa;
		
		if(densidade<=1.14) {
			System.out.println("Está na categoria 1.");
			
		}else if(densidade>=1.20) {
			System.out.println("Está na categoria 2.");
		}
		
		System.out.println("O volume do leite: "+volume+"\nA massa do leite: "+massa+"\nA densidade do leite: "+densidade+"\nValor total em R$: "+valor);
		
		scan.close();
	}
}
