package Lista4;

import java.util.Random;

public class Exercicio15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Random r = new Random();
			
			int matriz[][] = new int[50][2];
			double vet[] =  new double[50];
			int i=0,j=0;
			
			//Gera��o dos valores aleat�rios
			for(i=0;i<50;i++) {
				for(j=0;j<2;j++) {
					matriz[i][j] = r.nextInt(9)+1;
				}
			}
			
			//C�lculo
			for(i=0;i<50;i++) {
				vet[i] = (double)matriz[i][0] * matriz[i][1]/2;
			}
			
			//Impress�o
			for(i=0;i<50;i++) {
				System.out.println(matriz[i][0]+"   "+matriz[i][1]+" : "+vet[i]);
			}
			
	}
}