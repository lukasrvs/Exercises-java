package Lista3;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double saldo=0;
		double mov=0;
		String op=null;
		
		saldo = 0;
		
		for(;;) {
			System.out.println("Digite a opção que deseja fazer:\nA - Consulta de saldo \nB - Saque \nC - Depósito \nD - Sair ");
			op = String.valueOf(scan.nextLine());
			
			if(op.equalsIgnoreCase("a")) {
				System.out.println("Saldo atual: R$"+saldo);
				/* SALDO */
			}if(op.equalsIgnoreCase("b")) {
				System.out.println("Digite o valor que vai sacar:");
				mov = Double.parseDouble(scan.nextLine());
				if(saldo<mov) {
					System.out.println("Saldo insulficiente!!!");
				}if(saldo >= mov) {
					saldo-=mov;
					System.out.println("Saldo atual: R$"+saldo);
				}
				
				/* SAQUE */
				
			}if(op.equalsIgnoreCase("c")) {
				System.out.println("Digite o valor que deseja depositar:");
				mov = Double.parseDouble(scan.nextLine());
				saldo+=mov;
				System.out.println("Saldo atual: R$"+saldo);
				/* DEPOSITO */
				
			}if(op.equalsIgnoreCase("d")) {
				System.out.println("Sistema encerrando...");
				break;
				/* SAIR */
				
			}
		}
		
		scan.close();
	}
}
