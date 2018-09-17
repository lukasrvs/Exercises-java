package Lista5;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);	
		
		String palavra;  
		
		System.out.println("Digite uma palavra para verificar se é um palíndromo: ");
		palavra = String.valueOf(scan.nextLine());

		StringBuilder sb = new StringBuilder(palavra);
			
			System.out.println(sb.reverse());
			
			if(sb.reverse().equals(palavra)) {
				System.out.println("Esta palavra é um palíndromo");
			}else {
				System.out.println("Esta palavra não é um palíndromo");
			}

			scan.close();
	}

}

