package Lista6;

import java.util.Scanner;

public class Exercicio2Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Exercicio2Atributos aa = new Exercicio2Atributos();
		int aux1=0,aux2=0;

		System.out.println("Determine o valor de n1 : ");
		aa.setN1(Integer.parseInt(scan.nextLine()));
		System.out.println("Determine o valor de n2: ");
		aa.setN2(Integer.parseInt(scan.nextLine()));

		aux1 = aa.getN1();
		aux2 = aa.getN2();

		System.out.println("Valor n1: " + aa.getN1() + "\nValor n2: " + aa.getN2());
		System.out.println("\n----- VALORES TROCADOS -----\n");
		System.out.println("Valor n1: " + aux2 + "\nValor n2: " + aux1);

		scan.close();

	}
}
