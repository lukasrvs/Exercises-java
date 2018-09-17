package Lista5;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);

			String original = "";
			
			System.out.println("Digite uma frase desejada:");
			original = String.valueOf(scan.nextLine());
			
			System.out.println("Frase original:\n"+original);
			
			StringBuilder sb = new StringBuilder();
			sb.append(original);		
			original = new String(sb);
			
			String modificada = original.replace('a', '*');
			
			System.out.println("Frase modificada:\n"+modificada);
			
			scan.close();
	}

}
