package Lista4;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner (System.in);
			
			int quant[] = new int[2];
			String[] nome = new String[2];
			double preco[]= new double[2];
			int i=0,op=0,soma=0,subtraida=0,cod[]=new int[2];
			
			cod[0]= -1;
			
			for(i=0;i<2;i++) {
				cod[i]++;
				System.out.println("Digite o nome do produto: ");
				nome[i] = String.valueOf(scan.nextLine());
				System.out.println("Digite o preço do(a) "+nome[i]+" em R$:");
				preco[i] = Double.parseDouble(scan.nextLine());
				System.out.println("Digite a quantidade desse produto:");
				quant[i] =  Integer.parseInt(scan.nextLine());
			}	
			
			for(i=0;i<2;i++) {
				System.out.println("Digite a opção para (1-Compra/2-Venda)");
				op = scan.nextInt();
				if(op==1) {
					System.out.println("Qual código do produto comprado");
					cod[i] = Integer.parseInt(scan.nextLine());
					System.out.println("Digite a quantidade comprada: ");
					soma = Integer.parseInt(scan.nextLine());
					quant[i]+=soma;
				}else if(op==2) {
					System.out.println("Qual código do produto vendido");
					cod[i] = Integer.parseInt(scan.nextLine());
					System.out.println("Digite a quantidade vendida: ");
					subtraida = Integer.parseInt(scan.nextLine());
					quant[i]-=subtraida;
				}
			}
				for(i=0;i<2;i++) {
					System.out.printf("Código: "+cod[i]+"\nNome do produto: "+nome.length+"\nPreço: R$%"+preco[i]+"\nQuantidade: "+quant[i]);
				}
			
			scan.close();
	}
}
