package Lista6;

import java.util.Scanner;

public class Exercicio5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Exercicio5Eleicao el = new Exercicio5Eleicao();

		int voto,c1=0,c2=0,c3=0;
		
		System.out.println("Atribua um nome para o 1º Candidato: ");
		el.setNome1(String.valueOf(scan.nextLine()));
		System.out.println("Atribua um nome para o 2º Candidato: ");
		el.setNome2(String.valueOf(scan.nextLine()));
		System.out.println("Atribua um nome para o 3º Candidato: ");
		el.setNome3(String.valueOf(scan.nextLine()));
		
		for (;;) {
			System.out.println(
					"Menu de candidatos:\n 1 - "+el.getNome1()+"\n 2 - "+el.getNome2()+"\n 3 - "+el.getNome3()+"\n 4 - Finalizar a eleição\n>");
			
			voto = scan.nextInt();

			if (voto == 1) {
				c1+= el.getVoto1();
				el.c1();
				System.out.println("Candidato "+el.getNome1()+" recebeu +1 voto.\n");
			} else if (voto == 2) {
				c2+= el.getVoto2();
				el.c2();
				System.out.println("Candidato "+el.getNome2()+" recebeu +1 voto.\n");
			} else if (voto == 3) {
				c3+=el.getVoto3();
				el.c3();
				System.out.println("Candidato "+el.getNome3()+" recebeu +1 voto.\n");
			} else if (voto == 4) {
				System.out.println("Eleição finalizada...");
				break;
			}else {
				System.out.println("Opção Inválida!");
			}
		}
		
		System.out.println("\n----- RESULTADO -----\n");
		System.out.println(el.getNome1()+": "+c1+" votos\n"+el.getNome2()+": "+c2+" votos\n"+el.getNome3()+": "+c3+" votos\n");
		if((c1>c2)&(c1>c3)) {
			System.out.println(el.getNome1()+" ganhou a eleição!");
		}else if((c2>c1)&&(c2>c3)) {
			System.out.println(el.getNome2()+" ganhou a eleição!");
		}else if((c3>c1)&&(c3>c2)) {
			System.out.println(el.getNome3()+" ganhou a eleição!");
		}else if((c3==c1)&&(c2==c3)) {
			System.out.println("Houve empate entre os candidatos!");
		}
		
		
		scan.close();	
	}

}
