package Lista1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double raio;
		double result;
		double pi;
		System.out.println("Digite o raio do ciruclo: ");
		raio = in.nextFloat();
		
		pi=3.14;
		
		result= (raio*raio)*pi;
		
		System.out.println("O resultado da área desse circulo é: " +result);
		
		in.close(); 
	}
}
