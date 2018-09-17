package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();	
		
		int num[] = new int[16];
		int i=0;
		
		for(i=0;i<16;i++) {
			num[i] = r.nextInt(10);
		}
		System.out.println("Vetor: ");
		for(i=0;i<16;i++) {
			System.out.print(num[i]+" ");
		}
		
		scan.close();
	}
}
