package Lista3;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String lyric;
		String aux=null;
		int cont=0;
		
		for(;;) {
			System.out.println("Digite apenas uma letra [x para finalizar]");
			lyric = String.valueOf(scan.nextLine());
			
			if(lyric.equals("x")) {
				break;
			}
			
			if(lyric.equals(aux)) {
				cont++;
			}
			aux = lyric;
			
			
		}
		System.out.println("Foram digitadas "+cont+" letras consecutivamente.");
		
		scan.close();
		
	}

}
