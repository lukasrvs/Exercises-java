package Lista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int senha;
		for(;;) {
			
		System.out.println("Digite a senha para acessar: (0 para encerrar)");
		senha = scan.nextInt();
		
		if(senha==1234) {
			System.out.println("ACESSO LIBERADO !!!");
		}else if(senha!=1234) {
			System.out.println("ACESSO NEGADO !!!");
		}else if(senha==0) {
			System.out.println("Você escolheu parar !!!");
			break;
		}
		}
		
		scan.close();
	}
}
