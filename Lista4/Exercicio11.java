package Lista4;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		int i=0;
		int vetJan[] = new int[10];
		int vetFev[] = new int[10];
		int vetMar[] = new int[10];
		int vetAbr[] = new int[10];
		int vetMai[] = new int[10];
		int vetJun[] = new int[10];
		int vetJul[] = new int[10];
		int vetAgo[] = new int[10];
		int vetSet[] = new int[10];
		int vetOut[] = new int[10];
		int vetNov[] = new int[10];
		int vetDez[] = new int[10];
		int total1[] = new int[10];
		int total2[] = new int[10];
		
		System.out.println("Janeiro");
		for(i=0;i<10;i++) {
			System.out.println("Digite o número de produtos do tipo"+(1+i));
			vetJan[i] = scan.nextInt();
		}
		System.out.println("Fevereiro");
		for(i=0;i<10;i++) {
			System.out.println("Digite o número de produtos do tipo"+(1+i));
			vetFev[i] = scan.nextInt();
		}
		System.out.println("Março");
		for(i=0;i<10;i++) {
			System.out.println("Digite o número de produtos do tipo"+(1+i));
			vetMar[i] = scan.nextInt();
		}
		System.out.println("Abril");
		for(i=0;i<10;i++) {
			System.out.println("Digite o número de produtos do tipo"+(1+i));
			vetAbr[i] = scan.nextInt();
		}
		System.out.println("Maio");
		for(i=0;i<10;i++) {
			System.out.println("Digite o número de produtos do tipo"+(1+i));
			vetMai[i] = scan.nextInt();
		}
		System.out.println("Junho");
		for(i=0;i<10;i++) {
			System.out.println("Digite o número de produtos do tipo"+(1+i));
			vetJun[i] = scan.nextInt();
		}
		System.out.println("Julho");
		for(i=0;i<10;i++) {
			System.out.println("Digite o número de produtos do tipo"+(1+i));
			vetJul[i] = scan.nextInt();
		}
		System.out.println("Agosto");
		for(i=0;i<10;i++) {
			System.out.println("Digite o número de produtos do tipo"+(1+i));
			vetAgo[i] = scan.nextInt();
		}
		System.out.println("Setembro");
		for(i=0;i<10;i++) {
			System.out.println("Digite o número de produtos do tipo"+(1+i));
			vetSet[i] = scan.nextInt();
		}
		System.out.println("Outubro");
		for(i=0;i<10;i++) {
			System.out.println("Digite o número de produtos do tipo"+(1+i));
			vetOut[i] = scan.nextInt();
		}
		System.out.println("Novembro");
		for(i=0;i<10;i++) {
			System.out.println("Digite o número de produtos do tipo"+(1+i));
			vetNov[i] = scan.nextInt();
		}
		System.out.println("Dezembro");
		for(i=0;i<10;i++) {
			System.out.println("Digite o número de produtos do tipo"+(1+i));
			vetDez[i] = scan.nextInt();
		}
		
		for(i=0;i<10;i++) {
			total1[i] = vetJan[i] + vetFev[i] + vetMar[i] + vetAbr[i] + vetMai[i] + vetJun[i];
			total2[i] = vetJul[i] + vetAgo[i] + vetSet[i] + vetOut[i] + vetNov[i] + vetDez[i];
		}
		
		System.out.println("1º Semestre");
		for(i=0;i<10;i++) {
			System.out.println("Produto:"+(1+i)+"Número de vendas: "+total1[i]);
		}
		System.out.println("2º Semestre");
		for(i=0;i<10;i++) {
			System.out.println("Produto:"+(1+i)+"Número de vendas: "+total2[i]);
		}
		
		scan.close();
	}
}
