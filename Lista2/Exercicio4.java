package Lista2;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	double lados;
	double medida;
	
	System.out.println("Digite o número de lados: ");
	lados = scan.nextDouble();
	
	if(lados==3) {
		
		System.out.println("Digite a medida em (cm) do triângulo: ");
		medida = scan.nextDouble();
		medida = lados * medida;
		
		System.out.println("O valor da área desse triângulo é de: "+medida);
	}else if(lados==4) {
		
		System.out.println("Digite a medida em (cm) do quadrado: ");
		medida = scan.nextDouble();
		medida = lados * medida;
		
		System.out.println("O valor da área desse quadrado é de: "+medida);
	}else if(lados==5) {
		
		System.out.println("Digite a medida em (cm) do pentágono: ");
		medida = scan.nextDouble();
		medida = lados * medida;
		
		System.out.println("O valor da área desse pentágono é de: "+medida);
	}
	
	scan.close();
	
	}
}
