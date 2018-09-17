package Lista4;

import java.util.Random;

public class Exercicio16 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int a[][] = new int[8][8];
		int i=0,j=0;
		
		for(i=0;i<8;i++) {
			for(j=0;j<=i;j++) {
				a[i][j]= r.nextInt(9);
			}
		}
		
		for(i=0;i<8;i++) {
			for(j=0;j<8;j++) {
				System.out.print(a[i][j]+"  ");
				
			}
			System.out.println();
		}
	}
}
