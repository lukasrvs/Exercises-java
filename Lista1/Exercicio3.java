package Lista1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float salario;
		String nome;
		
		System.out.println("Digite o nome da pessoa: ");
		nome = in.nextLine();
		System.out.println("Digite o salário da pessoa: ");
		salario = in.nextFloat();
		
		System.out.println("Nome: " + nome);
		System.out.println("Salário: " + salario);
		
		in.close(); 
	}
}
