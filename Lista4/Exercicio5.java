package Lista4;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i=0;
		int vet[] = new int[40];
		
		System.out.println("Declare o Vetor : ");
		for(i=0;i<10;i++) {
			vet[i] = scan.nextInt();
		}
		
		System.out.println("Vetor Declarado ");
		for(i=0;i<40;i++) {
			System.out.print(vet[i]+" ");
		}
		
		for(i=0;i<40;i++) {
			if(vet[i]<0) {
				vet[i]=0;
			}
		}
		
		System.out.println("\nVetor Verificado: ");
		for(i=0;i<40;i++) {
			System.out.print(vet[i]+" ");
		}
		
		scan.close();
	}
}
