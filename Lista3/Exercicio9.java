package Lista3;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String genre=null;
		int cont=0;
		int age=0;
		int agelow=0;
		int agehigh=0;
		int contm=0;
		double soma=0;
		double payment=0;
		
		for(;;) {
			System.out.println("Digite a idade da pessoa: [N�mero negativo para finalizar]");
			age = scan.nextInt();
			cont++;
			if(age<0) {
				System.out.println("Programa encerrado !!!");
				cont--;
				break;
			}
			System.out.println("Digite o sexo: [f- Feminino m- Masculino]");
			genre = String.valueOf(scan.nextLine());
			System.out.println("Digite o sal�rio em R$:");
			payment = scan.nextDouble();
			if(age>agehigh) {
				agehigh = age;
			}if(age<agelow) {
				agelow = age;
			}
			soma+=payment;
			
			
			if(genre.equalsIgnoreCase("f")) {
				if(payment>2000) {
					contm++;
				}
			}
			
		}
		
		System.out.println("M�dia dos sal�rios: R$"+soma/cont+"\n"
							+"Maior sal�rio: R$"+agehigh+"\n"
								+"Menor sal�rio: R$"+agelow+"\n"
									+"Quantidade de mulheres com sal�rio at� R$2000,00: "+contm);
		
		scan.close();
	}
}
