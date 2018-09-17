package Lista6;

import java.util.Scanner;

public class Exercicio4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Exercicio4Calculadora cal = new Exercicio4Calculadora();

		System.out.println("\n------- Calculadora -------\n");
		System.out.println("Atribua o valor para o número 1: ");
		cal.setNumero1(Integer.parseInt(scan.nextLine()));
		System.out.println("Atribua o valor para o número 2: ");
		cal.setNumero2(Integer.parseInt(scan.nextLine()));

		System.out.println("\n-------- Resultado --------\n");

		System.out.println("Soma: " + cal.getNumero1() + " + " + cal.getNumero2() + " = " + cal.retornaSomaAtributos());
		System.out.println("Multiplicação: " + cal.getNumero1() + " x " + cal.getNumero2() + " = "
				+ cal.retornaMultiplicacaoAtributos());

		System.out.println("\n----- This is the end -----\n");

		scan.close();
	}

}
