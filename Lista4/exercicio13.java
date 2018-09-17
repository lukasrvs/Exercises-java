package Lista4;

import java.util.Scanner;

public class exercicio13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i=0,j=0,maior=0,piMaior=1,pjMaior=1;
		int matriz[][] = new int[10][10];
		
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				System.out.printf("Insira o valor para as coordenadas (%i,%i) (Sendo distintos)\n",i,j);
				matriz[i][j] = scan.nextInt();
			}
		}
		
		maior+=matriz[1][1];
		
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				if(matriz[i][j]>maior){
					maior=matriz[i][j];
					piMaior=i;
					pjMaior=j;
				}
			}
		}
		
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				System.out.print(matriz[i][j]);
				System.out.println(" ");
			}
		}
		
		System.out.println("O maior elemento da matriz é: "+maior+" na posição: "+piMaior+","+pjMaior);
		
		scan.close();
	}
}