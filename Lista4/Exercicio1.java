package Lista4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num[] = new int[5];
		int i=0;
		int MAX=5;
		
		for(i=0;i<MAX;i++) {
			System.out.println("Digite o número da posição "+(i+1));
			num[i] = scan.nextInt();
		}
		
		for(i=MAX-1;i>=0;i--) {
			System.out.print(num[i]+" ");
		}

		scan.close();
	}
}
