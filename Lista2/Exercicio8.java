package Lista2;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double chave;
		double num;
		double resposta;
		
		System.out.println("Digite o número chave: ");
		chave = scan.nextDouble();
		
		System.out.println("Agora digite um número escolhido por você de (0-100)");
		num = scan.nextDouble();
		
		for(;;) {
		if((num<0)||(num>100)) {
			System.out.println("Número digitado menor que 0 ou maior que 100, programa encerrado!!!");
			break;
		}if ((chave<0)||(chave>100)) {
			System.out.println("Número chave menor que 0 ou maior que 100, programa encerrado!!!");
			break;
		}
		}
		
		resposta = chave - num;
		
		if(resposta>0) {
			resposta = resposta * -1;
			System.out.println("Número chave: "+chave+"\n "
								+ "Número escolhido: "+num+"\n"
									+ "Resposta: "+resposta);
		}else
		System.out.println("Número chave: "+chave+"\n "
				+ "Número escolhido: "+num+"\n"
					+ "Resposta: "+resposta);
		
		scan.close();
	}
}
