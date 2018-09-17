package Lista5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			ArrayList<String> alunos = new ArrayList<String>();
			int opc=0;
			int i=0;
			String aluno;
			
			for(;;) {
				
				System.out.println("1-Inserir Aluno\n2-Consultar Aluno\n3-Remover Aluno\n4-Listar\n5-Sair\n");
				opc = Integer.parseInt(scan.nextLine());
				if(opc==1) {
					System.out.println("Você deseja inserir:\n1-Final da lista\n2-Posição específica");
					opc = Integer.parseInt(scan.nextLine());
					if(opc==1) {
						System.out.println("Digite o nome do aluno: ");
						aluno = String.valueOf(scan.nextLine());
						alunos.add(aluno);
					}else if(opc==2) {
						System.out.println("Digite o nome do aluno: ");
						aluno = String.valueOf(scan.nextLine());
						System.out.println("Determine o número do indice desse aluno");
						i = Integer.parseInt(scan.nextLine());
						alunos.set(i,aluno);
					}
				}if(opc==2) {
					System.out.println("Digite o indice do aluno que deseja consultar:");
					i = Integer.parseInt(scan.nextLine());
					System.out.println(alunos.get(i));
				}if(opc==3) {
					System.out.println("Digite o nome do aluno que deseja remover");
					i = Integer.parseInt(scan.nextLine());
					alunos.remove(i);
				}if(opc==4) {
					System.out.println("Listas:");
					for(i=0;i<alunos.size();i++) {
						System.out.println(alunos.get(i));
					}
				}if(opc==5) {
					System.out.println("Programa Encerrado !!!");
					break;
				}
			}
			
			scan.close();
	}

}
