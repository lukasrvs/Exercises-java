package Lista4;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			
			int gabarito[] = new int[10];
			int alunosNota[][] = new int[1000][10];
			int acertos[] = new int[10];
			int i=0,j=0;
			
			System.out.println("Gabarito correpondente:\nA = 0 \nB = 1 \nC = 2 \nD = 3\n");
			
			for(i=0;i<5;i++) {
				for(j=0;j<1000;j++) {
					System.out.println("Digite a resposta do aluno "+(i+1)+" Para questão "+(j+1)+": ");
					alunosNota[i][j] = Integer.parseInt(scan.nextLine()); 
				}
			}
			
			
			gabarito[0]=2;
			gabarito[1]=3;
			gabarito[2]=1;
			gabarito[3]=0;
			gabarito[4]=2;
			gabarito[5]=2;
			gabarito[6]=3;
			gabarito[7]=0;
			gabarito[8]=1;
			gabarito[9]=1;
			
			for(i=0;i<5;i++) {
				for(j=0;j<1000;j++) {
					if(alunosNota[i][j]==gabarito[i]) {
						acertos[i]+=1;
					}
				}
			}
			
			for(j=0;j<5;j++) {
				for(j=0;j<1000;j++) {
					System.out.println("Acertos do aluno "+(i+1)+" :"+acertos[i]);
				}
				System.out.println();
			}
			scan.close();
	}
}
