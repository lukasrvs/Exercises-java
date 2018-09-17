package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		int vet[] = new int[20];
		int i=0,MAX=20,x=0,flag=0;
		
		for(i=0;i<MAX;i++) {
			vet[i] = r.nextInt(20);
		}
		
		System.out.println("Vetor declarado: ");
		for(i=0;i<MAX;i++) {
			System.out.print(vet[i]+"  ");
		}
		
		System.out.println("\nEscolha um valor para X: ");
		x = scan.nextInt();
		
		System.out.println("Posições que o "+x+" encontradas esse número no vetor: ");
		
		for(i=0;i<MAX;i++) {
			if(vet[i]==x) {
				flag = 1;
				System.out.print((i+1)+"ª  ");
			}
		}
		if(flag==0) {
			System.out.println(" Não possui no vetor");
		}
		
		scan.close();
	}
}
