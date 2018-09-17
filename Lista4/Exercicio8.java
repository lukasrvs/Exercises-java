package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		int i=0,j=0,MAX=50;
		int vet[] = new int[51];
		
		System.out.println("Vetor Normal:");
		for(i=0;i<50;i++) {
			vet[i] = r.nextInt(2); /* Declaração do vetor randômico*/
			System.out.print(vet[i]+"  "); /* Impressão do vetor em linha horitzontal*/
		} 
		
		System.out.println("\n\n");
		for(MAX=0;MAX<50;MAX++) {
			for(i=0;i<MAX;i++) {
				if(vet[i]==0) {
					for(j=i;j<50;j++) {
					vet[j]=vet[j+1];
					}
				}
			}
		}
		
		
		//Impressão do vetor final
		System.out.println("Vetor Final:");
		for(i=0;i<50;i++) {
				System.out.print(vet[i]+"  "); /* Impressão do vetor em linha horitzontal*/
			} 
		
		scan.close();
	}

}
