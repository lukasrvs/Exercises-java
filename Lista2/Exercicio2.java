package Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int macas;
		double total;
		
		System.out.println("Digite o n�mero de ma��s compradas: ");
		macas = scan.nextInt();
		if(macas>12) {
			total = macas*0.25;
			System.out.println("O valor total � de R$"+df.format(total)+"\n"
								+ "O n�mero de ma��s � de: " +macas);
			total=0;
		}else if(macas<=12) {
			total = macas*0.30;
			System.out.println("O valor total � de R$"+df.format(total)+"\n" 
								+ "O n�mero de ma��s � de: " +macas);
			total=0;
		}
		
	scan.close();
	}
}
