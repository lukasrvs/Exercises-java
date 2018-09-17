package Lista6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Exercicio3Quilowatt kw = new Exercicio3Quilowatt();
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Digite o valor do salário mínimo: em R$");
		kw.setSalMin(Double.parseDouble(scan.nextLine()));
		System.out.println("Digite a quantidade de QuiloWatts gasta: ");
		kw.setQuantidade(Double.parseDouble(scan.nextLine()));

		System.out.println("\nValor total com 10% desconto: R$" + df.format(kw.valorTotalDesc())
				+ "\nValor total sem desconto: R$" + df.format(kw.valorTotal()));

		scan.close();
	}
}
