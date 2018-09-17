package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		int vet[] = new int[12];
		int i=0,x=0,y=0;
		
		for(i=0;i<12;i++) {
			vet[i] = r.nextInt(10);
		}
		System.out.println("Vetor declarado: ");
		for(i=0;i<12;i++) {
			System.out.print(vet[i]+"  ");
		}
		
		
		
		for(i=0;i<12;i++) {
			System.out.println("\nEscolha um valor contido no vetor para X: ");
			x = scan.nextInt();
			System.out.println("Escolha um valor contido no vetor para Y: ");
			y = scan.nextInt();
			if(vet[i]==x) {
			}if(vet[i]==y) {
				System.out.println("Os de X e Y número contém no vetor !!!\n"
						+ "Valor da soma: "+(x+y));
				break;
			}else if(vet[i]!=x) {
				System.out.println("Um dos números não contém no vetor !!!");
				break;
			}
		}
		
		scan.close();
	}
}
