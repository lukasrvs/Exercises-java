package Lista6;

import java.util.Scanner;

public class Exercicio1Main {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			Exercicio1Contador co = new Exercicio1Contador();
			int op=0;
			 
			 
			 for(;;) {
				 System.out.println("Valor atual do número:"+co.getNumero()+"\nEscolha uma opção:\n1 - Incrementar\n2 - Decrementar\n3 - Sair\n>");
				 op = Integer.parseInt(scan.nextLine());
				 
				 if(op==1) {
					 co.incremento();
				 }else if(op==2) {
					 co.decremento();
				 }else if(op==3) {
					 System.out.println("Finalizado...");
					 break;
				 }else {
					 System.out.println("Opção Inválida !!!");
				 }
			 }
			
			
			scan.close();
	}
}
