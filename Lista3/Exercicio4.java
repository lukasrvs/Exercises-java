package Lista3;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i=0;
		int contm=0;
		int contf=0;
		String genre=null;
		double media=0;
		double height=0;
		double heightlow=0;
		double heighthigh=0;
		double m=0;
		
		
		for(i=0;i<10;i++) {
			System.out.println("Digite o sexo da"+i+"ª pessoa: [F - Feminino e M - Masculino]");
			genre = String.valueOf(scan.nextLine());
			System.out.println("Digite a altura da"+i+"ª pessoa: ");
			height = Double.parseDouble(scan.nextLine());
			if(genre.equalsIgnoreCase("m")) {
				contm++;
			}if(genre.equalsIgnoreCase("f")) {
				contf++;
				m+=height;
			}
			if(height<heightlow) {
				heightlow=height;
			}if(height>heighthigh) {
				heighthigh=height;
			}
		}
		media=m/contf;
		System.out.println("A maior altura:"+heighthigh+"\n"
								+"A menor altura:"+heightlow+"\n"
									+"A média de altura das mulheres:"+media+"\n"
										+"A porcentagem de homens:"+(contm/100)+"%");
		
		scan.close();
	}
}
