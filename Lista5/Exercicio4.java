package Lista5;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);	
		
		String palavra;  
		
		System.out.println("Digite uma palavra para verificar se � um pal�ndromo: ");
		palavra = String.valueOf(scan.nextLine());

		StringBuilder sb = new StringBuilder(palavra);
			
			System.out.println(sb.reverse());
			
			if(sb.reverse().equals(palavra)) {
				System.out.println("Esta palavra � um pal�ndromo");
			}else {
				System.out.println("Esta palavra n�o � um pal�ndromo");
			}

			scan.close();
	}

}

