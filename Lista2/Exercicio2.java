package Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int macas;
		double total;
		
		System.out.println("Digite o número de maçãs compradas: ");
		macas = scan.nextInt();
		if(macas>12) {
			total = macas*0.25;
			System.out.println("O valor total é de R$"+df.format(total)+"\n"
								+ "O número de maçãs é de: " +macas);
			total=0;
		}else if(macas<=12) {
			total = macas*0.30;
			System.out.println("O valor total é de R$"+df.format(total)+"\n" 
								+ "O número de maçâs é de: " +macas);
			total=0;
		}
		
	scan.close();
	}
}
