package Example;

import java.util.Scanner;


public class Caixa {

	public static void main(String[] args) {
		contacorrente cc = new contacorrente();
		Scanner scan = new Scanner(System.in);
		int op;
		double valor;
		
		for(;;) {
			System.out.println("Escolha uma opção:\n1- Depositar\n2- Sacar\n3- Consultar Saldo\n4- Sair\n");
			op = Integer.parseInt(scan.nextLine());
			if(op==1) {
				System.out.println("Valor depósito: ");
				cc.deposito(Double.parseDouble(scan.nextLine()));
				
			}else if(op==2) {
				System.out.println("Valor desejado para saque: ");
				valor = Double.parseDouble(scan.nextLine());
				if(valor>cc.getsaldo()) {
					System.out.println("Saldo Insulficiente!!!\n");
				}else {
					cc.saque(valor);
					System.out.println("Valor de R$"+valor+" sacado!!!");
				}
			}else if(op==3){
				System.out.println("O valor atual do saldo é: R$"+cc.getsaldo()+"\n");
			}else if(op==4) {
				System.out.println("Operação finalizada!!!\nPrograma encerrando...");
				break;
			}else {
				System.out.println("Opção inválida!!!\n\nPrograma Finalizando...");
				break;
			}
		}
		
		scan.close();
	}
}
