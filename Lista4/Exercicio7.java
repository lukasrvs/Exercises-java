package Lista4;

import java.util.Random;

public class Exercicio7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 Random r = new Random();
			 
			 int i=0,j=0,flag=0;
			 int vet[] = new int [10];
			 
			 for(i=0;i<10;i++) { //Declarar o vetor randomicamente
				 vet[i] = r.nextInt(10);
			 }
			 
			 System.out.println("Vetor:");
			 for(i=0;i<10;i++) { //Impressão do vetor declarado
				System.out.print(vet[i]+" "); 
			 }
			 
			 System.out.println("");
			 for(i=0;i<10;i++) { //Verificação se existem números iguais dentro do vetor 
				 for(j=i;j<10;j++) {
					 if(vet[i]==vet[j]) {
						 flag=1;
						 System.out.print(vet[j]+" ");
					 }
				 }
			 }
			 
			 if(flag==0) {
				 System.out.println("\nNão possui números iguais.");
			 }
}
}