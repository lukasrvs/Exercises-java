package Lista4;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double salario[] = new double[35];
		int i=0,flag=0;
		
		for(i=0;i<35;i++) {
			System.out.println("Digite o sal�rio do empregado de codigo "+(i+1));
			salario[i] = Double.parseDouble(scan.nextLine());
			
		}
		
		for(i=0;i<35;i++) {
			System.out.print("Codigo: "+(i+1)+"  Sal�rio: R$"+salario[i]+"  \n");
		}
		System.out.println("\nC�digo dos empregados com sal�rio acima de R$880,00: ");
		for(i=0;i<35;i++) {
			 if(salario[i]>880.00) {
				 flag=1;
				 System.out.println("C�digo: "+(i+1));
			 }
		 }
		
		 if(flag==0) {
			 System.out.println("Nenhum empregado poss�i sal�rio superior a R$880,00.");
		 }
		 
		scan.close();
	}
}
