package Lista2;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		
		String telefone;
		double inter;
		double local;
		int tip;
		
		System.out.println("Qual é o tipo do telefone: [1-Residencial 2-Comercial 0-Finalizar]");
		tip = scan.nextInt();
		System.out.println("Digite o número do telefone: ");
		telefone = scan.nextLine();
		System.out.println("Quantidade de minutos em  ligações locais: ");
		local = scan.nextDouble();
		System.out.println("Quantidade de minutos em ligações interurbanas:");
		inter = scan.nextDouble();
		
		if(tip==1) {
			System.out.println("Tipo de telefone: Residencial\n"
					+"Número do telefone: "+telefone+"\n"
						+"Custo total para chamadas locais: R$"+(local*0.5)+"\n"
							+"Custo total para chamadas interurbanas: R$"+(inter*1.1)+"\n"
								+"Valor da conta sem a taxa R$"+((local*0.5)+(inter*1.1))+"\n"
									+"Valor da taxa FNT R$"+(((local*0.5)+(inter*1.1))*0.3)+"\n"
										+"Valor total R$"+((((local*0.5)+(inter*1.1))*1.3)+10.2));
		}else if(tip==2) {
			System.out.println("Tipo de telefone: Comercial\n"
					+"Número do telefone: "+telefone+"\n"
						+"Custo total para chamadas locais: R$"+(local*0.5)+"\n"
							+"Custo total para chamadas interurbanas: R$"+(inter*1.1)+"\n"
								+"Valor da conta sem a taxa R$"+((local*0.5)+(inter*1.1))+"\n"
									+"Valor da taxa FNT R$"+(((local*0.5)+(inter*1.1))*0.3)+"\n"
										+"Valor total R$"+((((local*0.5)+(inter*1.1))*1.3)+19.5));
		} 
		scan.close();
	}
}
